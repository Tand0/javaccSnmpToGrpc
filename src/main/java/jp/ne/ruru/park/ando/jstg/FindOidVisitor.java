package jp.ne.ruru.park.ando.jstg;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jp.ne.ruru.park.ando.snmpviewer.tree.*;

/**
 * find Object-ID visitor
 * 
 * @author foobar@em.boo.jp
 *
 */
public class FindOidVisitor implements AsnParserVisitor,AsnParserTreeConstants {
	/** find Object-ID visitor */
	public FindOidVisitor() {
		this.inputList = new HashMap<File,ASTInput>();
		this.valueAssignment = new HashMap<File,List<ASTValueAssignment>>();
		this.typeAssignment = new HashMap<File,List<ASTTypeAssignment>>();
		this.oidList = new HashMap<String, String>();
		this.oidList.put("iso","1");
		this.oidList.put("org","1.3");
	}

	/**
	 * caller
	 * 
	 * @param file
	 *            file name
	 * @throws ParseException
	 *             I got the parser exception.
	 * @throws IOException
	 *             I got the I/O exception.
	 * @throws FileNotFoundException
	 *             I got the file not found exception.
	 */
	public void addInput(File file) throws ParseException, FileNotFoundException, IOException {
		AsnParser parser;
		try (InputStream is = new FileInputStream(file)) {
			parser = new AsnParser(is);
			ASTInput input = parser.Input();
			this.inputList.put(file,input);
			input.jjtAccept(this, file);
		}
	}

	/**
	 * get getValueAssignment
	 * @return valueAssignment
	 */
	public Map<File,List<ASTValueAssignment>> getValueAssignment() {
		return valueAssignment;
	}
	/**
	 * oid name to object
	 * @param object name
	 * @return object
	 */
	public ASTValueAssignment getNameToValueAssignment(String target) {
		for (Map.Entry<File,List<ASTValueAssignment>> entry :this.valueAssignment.entrySet()) {
			for (ASTValueAssignment value:entry.getValue()) {
				if (target.equals(getValueAssignmentToName(value))) {
					return value;
				}
			}
		}
		return null;
	}
	/**
	 * oid name to object
	 * @param object name
	 * @return object
	 */
	public ASTTypeAssignment getNameToTypeAssignment(String target) {
		for (Map.Entry<File,List<ASTTypeAssignment>> entry :this.typeAssignment.entrySet()) {
			for (ASTTypeAssignment value:entry.getValue()) {
				String work = getTypeAssignmentToName(value);
				if (target.equals(work)) {
					return value;
				}
			}
		}
		return null;
	}
	
	/**
	 * Name to type
	 * @param name
	 * 
	 */
	public String getNameToType(String name) {
		if (name == null) {
			return "OCTET STRING";
		} else if (name.equals("DisplayString")
				|| name.equals("AutonomousType")
				|| name.equals("OBJECT IDENTIFIER")
				|| name.equals("OCTET STRING")
				|| name.equals("Opaque")
				|| name.equals("INTEGER")
				|| name.equals("Integer")
				|| name.equals("IANAifType")
				|| name.equals("IANAtunnelType")
				|| name.equals("Integer32")
				|| name.equals("Integer64")
				|| name.equals("Unsigned")
				|| name.equals("Unsigned32")
				|| name.equals("Unsigned64")
				|| name.equals("Counter")
				|| name.equals("Counter32")
				|| name.equals("Counter64")
				|| name.equals("Gauge")
				|| name.equals("Gauge32")
				|| name.equals("Gauge64")
				|| name.equals("TimeTicks")
				|| name.equals("InetAddressIPv6")
				|| name.equals("IpAddress")
				|| name.equals("InetAddress")
				|| name.equals("BITS")) {
			return name;
		}
		SimpleNode syntax = null;
		ASTValueAssignment va = this.getNameToValueAssignment(name);
		if (va != null) {
			syntax = this.findNode(va,AsnParserTreeConstants.JJTSNMPSYNTAXPART);
		}
		if (syntax == null) {
			ASTTypeAssignment ty = this.getNameToTypeAssignment(name);
			if (ty != null) {
				syntax = this.findNode(ty,AsnParserTreeConstants.JJTSNMPSYNTAXPART);
				if (syntax == null) {
					syntax = this.findNode(ty,AsnParserTreeConstants.JJTTYPE);
				}
			}
		}
		if (syntax == null) {
			return "OCTET STRING";
		}
		if (0 < syntax.jjtGetNumChildren()) {
			syntax = (SimpleNode)syntax.jjtGetChild(0);
		}
		if (syntax instanceof ASTType) {
			if (0 < syntax.jjtGetNumChildren()) {
				syntax = (SimpleNode)syntax.jjtGetChild(0);
			}
		}
		if (syntax instanceof ASTDefinedType) {
			if (0 < syntax.jjtGetNumChildren()) {
				syntax = (SimpleNode)syntax.jjtGetChild(0);
			}
		}
		if (syntax instanceof ASTtypereference) {
			Token token = (Token)syntax.jjtGetValue();
			if (token != null) {
				String newKey = token.image;
				return this.getNameToType(newKey);
			}
		}
		if (syntax instanceof ASTBuiltinType) {
			if (0 < syntax.jjtGetNumChildren()) {
				syntax = (SimpleNode)syntax.jjtGetChild(0);
			}
		}
		if (syntax instanceof ASTIntegerType) {
			return "INTEGER";
		}
		if (syntax instanceof ASTOctetStringType) {
			return "OCTET STRING";
		}
		if (syntax instanceof ASTObjectIdentiferType) {
			return "OBJECT IDENTIFIER";
		}
		if (syntax instanceof ASTChoiceType) {
			return "CHOICE";
		}
		if (syntax instanceof ASTSetOrSequenceOfType) {
			return "table";
		}
		if (syntax instanceof ASTSetOrSequenceType) {
			return "table";
		}
		return syntax.getClass().getName();
	}

	/**エントリーからシーケンスの一覧を取り出す。
	 * 
	 */
	public HashMap<String,String> getValueAssignmentToSequenceList(ASTValueAssignment vt) {
		//
		HashMap<String,String> ans = new HashMap<String,String>();
		//
		SimpleNode syntax = this.findNode(vt,AsnParserTreeConstants.JJTSNMPSYNTAXPART);
		if (syntax == null) {
			return ans;
		}
		SimpleNode typeDef = this.findNode(syntax,AsnParserTreeConstants.JJTTYPEREFERENCE);
		if (typeDef == null) {
			return ans;
		}
		Token token = (Token)typeDef.jjtGetValue();
		if (token == null) {
			return ans;
		}
		String taName = token.image;
		if (taName == null) {
			return ans;
		}
		ASTTypeAssignment ty = this.getNameToTypeAssignment(taName);
		if (ty == null) {
			return ans;
		}
		SimpleNode elementList = this.findNode(ty,AsnParserTreeConstants.JJTELEMENTTYPELIST);
		for (int i = 0 ; i < elementList.jjtGetNumChildren() ; i++) {
			SimpleNode elementType = (SimpleNode) elementList.jjtGetChild(i);
			if (elementType.jjtGetNumChildren() <1) {
				continue;
			}
			SimpleNode namedLType = (SimpleNode) elementType.jjtGetChild(0);
			if (namedLType.jjtGetNumChildren() < 2) {
				continue;
			}
			SimpleNode key = (SimpleNode) namedLType.jjtGetChild(0);
			SimpleNode value = (SimpleNode) namedLType.jjtGetChild(1);
			
			String keyString = findString(key);
			String valueString =findString(value);
			if ((keyString == null) || (valueString == null)) {
				continue;
			}
			ans.put(keyString, valueString);
		}
		
		return ans;
	}

	/**
	 * object to object name
	 * @param node object
	 * @return object name
	 */
	public String getValueAssignmentToName(ASTValueAssignment node) {
		SimpleNode child = (SimpleNode)node.jjtGetChild(0);
		return (String)((Token)child.jjtGetValue()).image;
	}
	/**
	 * object to object name
	 * @param node object
	 * @return object name
	 */
	public String getTypeAssignmentToName(ASTTypeAssignment node) {
		SimpleNode child = (SimpleNode)node.jjtGetChild(0);
		return (String)((Token)child.jjtGetValue()).image;
	}
	/**
	 * find node
	 * @param rootNode root node
	 * @param id target ID
	 * @return find node
	 */
	public SimpleNode findNode(SimpleNode rootNode,int id) {
		Deque<Node> queue = new ArrayDeque<Node>();
		queue.offer(rootNode);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			//SimpleNode sNode = (SimpleNode)node;
			//System.out.println("--id=" + sNode.getId());
			//sNode.dump(" a");
			if (node.getId() == id) {
				return (SimpleNode)node;
			}
			IntStream.range(0, node.jjtGetNumChildren())
			.mapToObj(node::jjtGetChild)
			.filter(e->e!=null)
			.forEachOrdered(queue::offer);
		}
		return null;
	}
	/**
	 * find type
	 * @param node this node
	 * @return find node
	 */
	public SimpleNode findType(ASTValueAssignment node) {
		for (int i = 0 ; i < node.jjtGetNumChildren() ;i ++) {
			SimpleNode subNode = (SimpleNode)node.jjtGetChild(i);
			if (subNode instanceof ASTGlobalType) {
				SimpleNode ans = subNode;
				if (0 < ans.jjtGetNumChildren()) {
					ans = (SimpleNode) ans.jjtGetChild(0);
				}
				return ans;
			}
		}
		return null;
	}
	/**
	 * find access
	 * @param node this node
	 * @return result
	 */
	public String findAccess(ASTValueAssignment node) {
		SimpleNode access = this.findNode(node,AsnParserTreeConstants.JJTSNMPACCESS);
		if (access == null) {
			return null;
		}
		return this.findString(access);
	}
	/**
	 * find access
	 * @param node this node
	 * @return result
	 */
	public boolean isParentIndex(ASTValueAssignment node) {
		String parent = this.getNameToLeft(node);
		if (parent == null) {
			return false;
		}
		ASTValueAssignment vaParent = this.getNameToValueAssignment(parent);
		if (vaParent == null) {
			return false;
		}
		SimpleNode index = this.findIndex(vaParent);
		if (index != null) {
			return true;
		}
		return isParentIndex(vaParent);
	}
	/**
	 * find access
	 * @param node this node
	 * @return result
	 */
	public SimpleNode findIndex(ASTValueAssignment node) {
		SimpleNode access = this.findNode(node,AsnParserTreeConstants.JJTSNMPINDEXPART);
		if (access == null) {
			return null;
		}
		return access;
	}

	/**
	 * (ex)name =: { left right }
	 * @param node node
	 * @return left
	 */
	public String getNameToLeft(SimpleNode node) {
		SimpleNode builtinValue = findNode(node,JJTBUILTINVALUE);
		SimpleNode componentList = findNode(builtinValue,JJTOBJIDCOMPONENTLIST);
		SimpleNode leftObjIdComponent = (SimpleNode)componentList.jjtGetChild(componentList.jjtGetNumChildren()-2);
		SimpleNode leftIdentifier = (SimpleNode)findNode(leftObjIdComponent,JJTIDENTIFIER);
		if (leftIdentifier == null) {
			leftObjIdComponent = (SimpleNode)componentList.jjtGetChild(0);
			leftIdentifier = (SimpleNode)findNode(leftObjIdComponent,JJTIDENTIFIER);
		}
		Token token = (Token)leftIdentifier.jjtGetValue();
		return token.image;
	}
	/**
	 * (ex)name =: { left right }
	 * @param node node
	 * @return right
	 */
	public int getNameToRight(SimpleNode node) {
		SimpleNode builtinValue = findNode(node,JJTBUILTINVALUE);
		SimpleNode componentList = findNode(builtinValue,JJTOBJIDCOMPONENTLIST);
		SimpleNode right = (SimpleNode)componentList.jjtGetChild(componentList.jjtGetNumChildren()-1);
		SimpleNode rightIdent = (SimpleNode)findNode(right,JJTNUMBER);
		Token token = (Token)rightIdent.jjtGetValue();
		int ans = Integer.parseInt(token.image);
		return ans;
	}
	/**
	 * object name to oid
	 * @param target object name
	 * @return oid
	 */
	public String getOid(String target) {
		String oid = this.oidList.get(target);
		if (oid == null) {
			ASTValueAssignment node = getNameToValueAssignment(target);
			if (node == null) {
				return null;
			}
			oid = this.getOid(node);
		}
		return oid;
	}
	/**
	 * object to oid
	 * @param node object
	 * @return oid
	 */
	public String getOid(ASTValueAssignment node) {
		String target = this.getValueAssignmentToName(node);
		String oid;
		String left = getNameToLeft(node);
		//System.out.println("target=" + target + " left=" + left);
		if (left != null) {
			oid = getOid(left) + "." + this.getNameToRight(node);
		} else {
			oid = target;
		}
		this.oidList.put(target, oid);
		return oid;
	}
	/**
	 * object to OBJECTS
	 * @param node object
	 * @return OBJECTS
	 */
	public List<String> findObjects(ASTValueAssignment node) {
		SimpleNode target = findNode(node,JJTSNMPOBJECTSPART);
		target = findNode(node,JJTTYPEORVALUELIST);
		List<String> ans = new ArrayList<String>();
		if (target != null) {
			createSameValueList(target,JJTIDENTIFIER,ans);
		}
		return ans;
	}
	/**
	 * create same value list
	 * @param node object
	 * @param id jjtree-id
	 * @param list outout
	 */
	public void createSameValueList(SimpleNode node,int id,List<String> list) {
		if (node == null) {
			return;
		}
		if (node.getId() == id) {
			Token token = (Token)node.jjtGetValue();
			if ((token != null) && (token.image != null)) {
				list.add(token.image);
			}
		}
		IntStream.range(0, node.jjtGetNumChildren())
		.mapToObj(i->(SimpleNode)node.jjtGetChild(i))
		.filter(i->i != null)
		.forEachOrdered(i->createSameValueList(i,id,list));;
	}
	/**
	 * object to image
	 * @param node object
	 * @return image
	 */
	public String findString(SimpleNode node) {
		Token token = (Token)node.jjtGetValue();
		if ((token != null) && (token.image != null)) {
			return token.image;
		}
		List<SimpleNode> list = IntStream.range(0, node.jjtGetNumChildren())
				.mapToObj(i->(SimpleNode)node.jjtGetChild(i))
				.filter(i->i != null)
				.collect(Collectors.toList());
		for (SimpleNode child :list) {
			String next = this.findString(child);
			if (next != null) {
				return next;
			}
		}
		return null;
	}
	/**
	 * dump
	 * @param prefix prefix
	 * @param node target node
	 */
	public void dump(StringBuffer buffer,String prefix,SimpleNode node) {
		Token token = (Token) node.jjtGetValue();
		buffer.append(prefix).append("<");
		buffer.append(node.toString());
		if ((token != null) && (token.image != null)) {
			buffer.append(" value=\"");
			try {
				buffer.append(URLEncoder.encode(token.image,"UTF-16"));
			} catch (UnsupportedEncodingException e) {
				buffer.append("***");
			}
			buffer.append("\"");
		}
		buffer.append(">\r\n");
		IntStream.range(0,node.jjtGetNumChildren())
		.mapToObj(i->(SimpleNode)node.jjtGetChild(i))
		.filter(i->i != null)
		.forEachOrdered(n->this.dump(buffer,prefix + "  ",n));
		buffer.append(prefix).append("</").append(node.toString()).append(">\r\n");
	}
	/**
	 * dump
	 * @param prefix prefix
	 * @param node target node
	 */
	public void findDescription(StringBuffer buffer,String prefix,SimpleNode node) {
		SimpleNode desc;
		desc = findNode(node,JJTSNMPDESCRPART);
		if (desc != null) {
			Token token = (Token) desc.jjtGetValue();
			if ((token != null) && (token.image != null)) {
				try (StringReader reader = new StringReader( token.image );
						BufferedReader br = new BufferedReader(reader)) {
					br.lines().forEachOrdered(e->buffer.append(prefix).append(e).append("\r\n"));
				} catch (IOException e1) {
					//NODE
				} 
			}
		}
		desc = findNode(node,JJTSNMPDISPLAYHINTPART);
		if (desc != null) {
			Token token = (Token) desc.jjtGetValue();
			if ((token != null) && (token.image != null)) {
				try (StringReader reader = new StringReader( token.image );
						BufferedReader br = new BufferedReader(reader)) {
					br.lines().forEachOrdered(e->buffer.append(prefix).append(e).append("\r\n"));
				} catch (IOException e1) {
					//NODE
				} 
			}
		}
	}
	/**
	 * default vistor
	 * @param node vistor node
	 * @param data vistor data
	 * @return visitor output
	 */
	public Object defaultVisit(SimpleNode node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	public Object visit(SimpleNode node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTInput node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTModuleDefinition node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTagDefault node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTModuleIdentifier node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTAssignedIdentifier node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTModuleBody node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTExports node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbolsExported node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTExportSymbolList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTImports node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbolsImported node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbolsFromModuleList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbolsFromModule node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbolList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSymbol node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTAssignmentList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTAssignment node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTMacroDefinition node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTMacroBody node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTMacroReference node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTypeAssignment node, Object data) {
		//System.out.println("target=" + this.getValueToName(node));
		File file = (File)data;
		List<ASTTypeAssignment> taList = typeAssignment.get(file);
		if (taList == null) {
			taList = new ArrayList<ASTTypeAssignment>();
			typeAssignment.put(file, taList);
		}
		taList.add(node);
		return defaultVisit(node, data);
	}

	public Object visit(ASTType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTGlobalType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTDefinedMacroName node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTDefinedType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTBuiltinType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTEnumeratedType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTIntegerType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTBitStringType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSetOrSequenceOfType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTChoiceType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSetOrSequenceType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSelectionType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTaggedType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTag node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTAnyType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNamedNumberList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNamedNumber node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSignedNumber node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTElementTypeList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTElementType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTComponentsType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNamedType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTClassNumber node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTClass node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSubtypeSpec node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSubtypeValueSetList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSubtypeValueSet node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTContainedSubtype node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSingleValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTValueRange node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSizeConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTPermittedAlphabet node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTInnerTypeConstraints node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSingleTypeConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTMultipleTypeConstraints node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTypeConstraints node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNamedConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTValueConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTPresenceConstraint node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTValueAssignment node, Object data) {
		//System.out.println("target=" + this.getValueToName(node));
		File file = (File)data;
		List<ASTValueAssignment> vaList = valueAssignment.get(file);
		if (vaList == null) {
			vaList = new ArrayList<ASTValueAssignment>();
			valueAssignment.put(file, vaList);
		}
		vaList.add(node);
		return defaultVisit(node, data);
	}

	public Object visit(ASTValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTDefinedValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTBuiltinValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTCompoundValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTskip_to_matching_brace node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTBooleanValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSpecialRealValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNullValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNamedValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjectIdentifierValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjIdComponentList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjIdComponent node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNumberForm node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNameAndNumberForm node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTBinaryString node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTHexString node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTCharString node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTnumber node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTidentifier node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTmodulereference node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTtypereference node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTextualConventionMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTModuleIdentityMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNotificationTypeMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTNotificationGroupMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTModuleComplianceMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjecGroupMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjecIdentityMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTrapTypeMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTAgentCapabilitiesMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTObjectTypeMacroType node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDisplayHintPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpObjectsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpNitificationsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpStatus node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpAccess node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDescrPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpReferencePart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpIndexPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpExtendsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpUniquenessPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTypeOrValueList node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTTypeOrValue node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDefValPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDefValSubPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDefValSubSubPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpDefValSubSubSubPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpAugmentsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpInstallErrorsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpSubjectCategoriesPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpLastUpdatedPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpOrganizationPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpContactInfoPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpRevisionPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpReferencesPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpSyntaxPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpWriteSyntaxPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpEnterprisePart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpVariablesPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpUnitsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpTagPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpMandatoryGroupsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpGroupPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpObjectPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpProductReleasePart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpSupportsPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpIncludesPart node, Object data) {
		return defaultVisit(node, data);
	}

	public Object visit(ASTSnmpValiationPart node, Object data) {
		return defaultVisit(node, data);
	}
	@Override
	public Object visit(ASTOctetStringType node, Object data) {
		return defaultVisit(node, data);
	}

	@Override
	public Object visit(ASTObjectIdentiferType node, Object data) {
		return defaultVisit(node, data);
	}

	@Override
	public Object visit(ASTRealType node, Object data) {
		return defaultVisit(node, data);
	}

	@Override
	public Object visit(ASTBooleanType node, Object data) {
		return defaultVisit(node, data);
	}

	@Override
	public Object visit(ASTNullType node, Object data) {
		return defaultVisit(node, data);
	}

	@Override
	public Object visit(ASTExternalType node, Object data) {
		return defaultVisit(node, data);
	}

	/** ASN parser data */
	private final Map<File,ASTInput> inputList;
	
	/** object data */
	private final HashMap<File, List<ASTValueAssignment>> valueAssignment;
	
	/** object data */
	private final HashMap<File, List<ASTTypeAssignment>> typeAssignment;
	
	/** oid list */
	private final HashMap<String, String> oidList;

}
