package jp.ne.ruru.park.ando.jstg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.ne.ruru.park.ando.snmpviewer.tree.ASTValueAssignment;
import jp.ne.ruru.park.ando.snmpviewer.tree.AsnParserTreeConstants;
import jp.ne.ruru.park.ando.snmpviewer.tree.ASTNotificationTypeMacroType;
import jp.ne.ruru.park.ando.snmpviewer.tree.ParseException;
import jp.ne.ruru.park.ando.snmpviewer.tree.SimpleNode;
import jp.ne.ruru.park.ando.snmpviewer.tree.ASTObjectTypeMacroType;

/**
 * SNMP to grpc
 * @author 安藤
 *
 */
public class Main {
	/** プロパティファイルの位置 */
	public static final String TARGET_PROPERTIES1 = "jstg.properties";
	public static final String TARGET_PROPERTIES2 = "src/main/config/jstg.properties";
	/**
	 * メイン部分
	 * @param args コマンド引数
	 * @throws IOException 例外出たら死ぬ
	 */
	public static void main(String[] args) throws IOException {
		File file;
		if (0 < args.length) {
			file = new File(args[0]);
		} else {
			file = new File(TARGET_PROPERTIES1);
			if (!file.isFile()) {
				file = new File(TARGET_PROPERTIES2);
			}
		}
		Main main = new Main();
		main.run(file);
		//
		System.out.println("END");
	}
	/**
	 * コンストラクタ
	 */
	public Main() {
		this.configuration = new Properties();
	}
	/**
	 * 入力ファイルのチェック
	 * @param file ファイル
	 * @throws IOException 例外出たら死ぬ
	 */
	protected void run(File file) throws IOException {
		try (InputStream inputStream = new FileInputStream(file)) {
			configuration.load(inputStream);
		}

		File fromDir = this.fileInput(
				"jp.ne.ruru.park.ando.jstg.fromdir",false);
		todirproto = this.fileInput(
				"jp.ne.ruru.park.ando.jstg.todirproto",false);
		todirjava = this.fileInput(
				"jp.ne.ruru.park.ando.jstg.todirjava",false);
		protoc = this.fileInput(
				"jp.ne.ruru.park.ando.jstg.protoc",true);
		//
		packagename = this.configuration.getProperty(
				"jp.ne.ruru.park.ando.jstg.packagename");
		if (packagename == null) {
			throw new IOException("KeyNotFoundException key="
					+ "jp.ne.ruru.park.ando.jstg.packagename");
		}
		//
		targetreglex = this.configuration.getProperty(
				"jp.ne.ruru.park.ando.jstg.targetreglex");
		if ((targetreglex == null) || (targetreglex.equals(""))) {
			targetreglex = null;
		}
		//
		// ファイルの読み込み
		parseFolder(fromDir);
		
		// ファイルの書き込み
		visitor.getValueAssignment().keySet().stream().forEach(this::runFile);
	}
	
	/**
	 *  入力テスト
	 * @param key プロパティ名
	 * @param isFile ファイルならture,フォルダならfalse
	 * @return ファイル名
	 * @throws IOException ファイルが存在しない場合true
	 */
	protected File fileInput(String key,boolean isFile) throws IOException {
		String workString = this.configuration.getProperty(key);
		if (workString == null) {
			throw new IOException("KeyNotFoundException key=" + key);
		}
		File file = new File(workString);
		if ((isFile && (!file.isFile()))
				|| ((!isFile) && (!file.isDirectory()))) {
			file = new File("../../..",workString);
			if ((isFile && (!file.isFile()))
				|| ((!isFile) && (!file.isDirectory()))) {
				String res = "FileNotFoundException key=" + key + " value=" + workString;
				throw new java.io.FileNotFoundException(res);
			}
		}
		return file;
	}
	/**
	 * 入力ファイルのチェック
	 * @param file folder
	 */
	protected void parseFolder(File file) {
		if (!file.exists()) {
			System.err.println("Skip file=" + file);
		} else if (file.isDirectory()) {
			Arrays.asList(file.listFiles()).stream().forEach(this::parseFolder);
		} else if (file.isFile()) {
			this.parseFile(file);
		}
	}
	/**
	 * 入力ファイルのチェック
	 * @param file file
	 */
	protected void parseFile(File file) {
		try (InputStream is = new FileInputStream(file)) {
			visitor.addInput(file);
		} catch (FileNotFoundException e) {
			System.err.println("Skip file=" + file);
			System.err.println("I got the error=" + e.getClass() + " message=" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Skip file=" + file);
			System.err.println("Skip file=" + file);
			System.err.println("I got the error=" + e.getClass() + " message=" + e.getMessage());
			e.printStackTrace();
		} catch (ParseException e) {
			System.err.println("Skip file=" + file);
			System.err.println("Skip file=" + file);
			System.err.println("I got the error=" + e.getClass() + " message=" + e.getMessage());
			e.printStackTrace();
		}
	}
	/**
	 * 実処理
	 * @param file file
	 * @param visitor 構文解析住みファイル
	 */
	protected void runFile(File file) {
		if (this.targetreglex != null) {
	        Pattern p = Pattern.compile(this.targetreglex);
	        Matcher m = p.matcher(file.getAbsolutePath());
	        if (!m.find()) {
	        	System.err.println("Skip file=" + file);
	        	return;
	        }
		}
		
		//
		String name = file.getName();
		// 名前から拡張子を取る。
		int index = name.lastIndexOf('.');
		if (0 <= index) {
			name = name.substring(0, index);
		}
		// いらないものを取る
		name = name.replace("-MIB", "");
		name = name.replace("-PIB", "");
		name = this.chngeFileToClassName(name);
		// 中身の生成
		File toName = new File(todirproto,name + ".proto");
		
		//
		// パッケージ名を取る
		String nextPackName = file.getName();
		index = nextPackName.lastIndexOf('.');
		if (0 <= index) {
			nextPackName = nextPackName.substring(0, index);
		}
		nextPackName = this.changePackageName(nextPackName);
		//
		
		// ファイルの生成
		List<MessageCreator> messageList = this.createFile(file, nextPackName,name, toName);
		
		// protocの実行
		this.createProtoc(toName);
		
		// ラッパーの生成
		this.createWrapper(file,nextPackName,name,messageList);
	}
	
	/**
	 * ファイルの生成
	 * @param file ファイル名
	 * @param nextPacName パッケージ名
	 * @param name 名称
	 * @param toName ファイル名をFile型に変換したもの
	 */
	protected List<MessageCreator> createFile(File file,String nextPacName,String name,File toName) {
		System.out.println("Create file=" + file + " -> " + toName);
		//
		//
		StringBuffer buff = new StringBuffer();
		buff.append("//\r\n");
		buff.append("// snmp to grpc (*.protoc)\r\n");
		buff.append("//\r\n");
		buff.append("syntax = \"proto3\";\r\n");
		buff.append("\r\n");
		buff.append("option java_multiple_files = true;\r\n");
		buff.append("option java_package = \"" + this.packagename + "." + nextPacName + "\";\r\n");
		buff.append("option java_outer_classname = \"" + name + "\";\r\n");
		buff.append("option objc_class_prefix = \"HLW\";\r\n");
		buff.append("\r\n");
		buff.append("package " + nextPacName + ";\r\n");
		buff.append("\r\n");
		buff.append("// The greeting service definition.\r\n");
		buff.append("service " + name + "Service {\r\n");
		//
		List<ASTValueAssignment> vaList = visitor.getValueAssignment().get(file);
		vaList.stream().forEach(node->{
			String nodeName = visitor.getValueAssignmentToName(node);
			String nodeClassName = changeToClassName(nodeName);
			SimpleNode nodeType = visitor.findType(node);
			//buff.append("\r\n");
			//buff.append("  // nodeName=").append(nodeName).append("\r\n");
			//buff.append("  // nodeType=").append(nodeType).append("\r\n");
			//buff.append("  // access  =").append(access).append("\r\n");
			if (nodeType instanceof ASTNotificationTypeMacroType) {
				buff.append("  rpc trp" + nodeName + " (" + nodeClassName + "Key) returns (NoKey) {}\r\n");
			} else if (nodeType instanceof ASTObjectTypeMacroType) {
				String access = visitor.findAccess(node);
				SimpleNode indexNode = visitor.findIndex(node);
				if (visitor.isParentIndex(node)) {
					//buff.append("  // " + node + " is table parameter\r\n");
				} else if (null != indexNode) {
					buff.append("  rpc set" + nodeClassName + " (" + nodeClassName + "KeyIndex) returns (NoKey) {}\r\n");
					buff.append("  rpc get" + nodeClassName + " (" + nodeClassName + "Index) returns (" + nodeClassName + "Key) {}\r\n");
					buff.append("  rpc say" + nodeClassName + " (NoKey) returns (stream " + nodeClassName + "Index) {}\r\n");
				} else {
					if (this.isWrite(access)) {
						buff.append("  rpc set" + nodeClassName + " (" + nodeClassName + "Key) returns (NoKey) {}\r\n");
					}
					if (this.isRead(access)) {
						buff.append("  rpc get" + nodeClassName + " (NoKey) returns (" + nodeClassName + "Key) {}\r\n");
					}
				}
			}
		});
		buff.append("}\r\n");
		buff.append("\r\n");
		List<MessageCreator> messList = new ArrayList<MessageCreator>();
		//
		vaList.stream().forEach(node->{
			String nodeName = visitor.getValueAssignmentToName(node);
			String nodeClassName = changeToClassName(nodeName);
			SimpleNode nodeType = visitor.findType(node);
			buff.append("\r\n");
			buff.append("// nodeName=").append(nodeName).append("\r\n");
			//visitor.findDescription(buff,"//",node);
			if (nodeType instanceof ASTNotificationTypeMacroType) {
				MessageCreator mess = new MessageCreator(nodeClassName + "Key");
				List<String> objectsList = visitor.findObjects(node);
				objectsList.stream().forEachOrdered(key->{
					String type = visitor.getNameToType(key);
					mess.addKeyType(key, type);
				});
				mess.createMessage(buff);
				messList.add(mess);
			} else if (nodeType instanceof ASTObjectTypeMacroType) {
				String access = visitor.findAccess(node);
				buff.append("// access  =").append(access).append("\r\n");
				SimpleNode indexNode = visitor.findIndex(node);
				if (visitor.isParentIndex(node)) {
					buff.append("// this is table parameter\r\n");
				} else if (null != indexNode) {
					buff.append("// this is table\r\n");
					
					buff.append("message " + nodeClassName + "KeyIndex {\r\n");
					buff.append("  " + nodeClassName + "Key key = 1; \r\n");
					buff.append("  " + nodeClassName + "Index value = 2; \r\n");
					buff.append("}\r\n");
					//
					final MessageCreator messIndex = new MessageCreator(nodeClassName + "Index");
					List<String> indexList = new ArrayList<String>();
					visitor.createSameValueList(indexNode,
							AsnParserTreeConstants.JJTIDENTIFIER,indexList);
					indexList.stream().forEachOrdered(key->{
						String type = visitor.getNameToType(key);
						messIndex.addKeyType(key, type);
					});
					messIndex.createMessage(buff);
					messList.add(messIndex);
					//
					final MessageCreator messKey = new MessageCreator(nodeClassName + "Key");
					HashMap<String,String> valueMap = visitor.getValueAssignmentToSequenceList(node);
					visitor.createSameValueList(indexNode,
							AsnParserTreeConstants.JJTIDENTIFIER,indexList);
					messKey.removeAll(indexList);
					valueMap.entrySet().stream().forEachOrdered((entry)->{
						String key = entry.getKey();
						String type = visitor.getNameToType(entry.getValue());
						messKey.addKeyType(key, type);
					});
					messKey.createMessage(buff);
					messList.add(messKey);
					//
				} else if (this.isWrite(access) || this.isRead(access)) {
					//
					MessageCreator mess = new MessageCreator(nodeClassName + "Key");
					String type = visitor.getNameToType(nodeName);
					mess.addKeyType(nodeName, type);
					mess.createMessage(buff);
					messList.add(mess);
					//
				}
			} else {
				buff.append("// nodeType=").append(nodeType).append("\r\n");
			}
		});
		//
		buff.append("\r\n");
		buff.append("message NoKey {\r\n");
		buff.append("}\r\n");
		buff.append("\r\n");
		buff.append("\r\n");
		buff.append("\r\n");
		//
		// ファイル出力
        try (FileWriter fw = new FileWriter(toName, false);
            BufferedWriter bw = new BufferedWriter(fw)) {
            //
            bw.write(buff.toString());
            //
        } catch (IOException ex) {
        	System.out.println("Write error file=" + toName);
        }
        return messList;
	}
	
	/**
	 * protocの実行
	 * @param toName *.protocの位置
	 */
	protected void createProtoc(File toName) {
		String[] objects = {
				protoc.getAbsolutePath(),
				"--java_out=" + todirjava.getAbsolutePath(),
				"-I=" + (new File(".").getAbsolutePath()),
				toName.getAbsolutePath()
		};
        //System.out.println(protoc.getAbsolutePath() + " " + 
        //		"--java_out=" + todirjava.getAbsolutePath() + " " + 
        //		"-I=" + (new File(".").getAbsolutePath()) + " " + 
        //		toName.getAbsolutePath());      
        ProcessBuilder pb = new ProcessBuilder(objects);
        pb.redirectErrorStream(true);
    	try {
			Process process = pb.start();
			int ret = process.waitFor();
			if (ret != 0) {
				System.out.println("[FAILED] protoc process");
				System.out.print("comand=");
				Arrays.asList(objects).stream().forEachOrdered(key->
					System.out.print(" " + key));
				System.out.println();
				try (InputStream is = process.getInputStream();
						InputStreamReader isr = new InputStreamReader(is);
						BufferedReader br = new BufferedReader(isr)) {
					br.lines().forEachOrdered(System.out::println);
				}
				System.out.println("[FAILED] protoc process ret=" + ret);
			}
		} catch (IOException | InterruptedException e) {
			System.out.println("Cannot invoke protoc file=" + toName);
        	return;
		}
	}
	
	/** ラッパーを生成する
	 * @param file 元のファイル情報
	 * @param nextPackName パッケージ名
	 * @param name 名称
	 * @param messageList メッセージリスト
	 */
	public void createWrapper(File file,String nextPackName,String name,List<MessageCreator> messageList) {
		//
		// パッケージ名から対象のフォルダを作る
		//
		String worker = this.packagename;
		File nextToDir = todirjava;
		while (true) {
			int index = worker.indexOf('.');
			if (index < 0) {
				break;
			}
			String key = worker.substring(0,index);
			worker = worker.substring(index + 1);
			nextToDir = new File(nextToDir,key);
		}
		// 最後の残りを入れる
		nextToDir = new File(nextToDir,worker);
		nextToDir = new File(nextToDir,nextPackName);
		//
		final File fDir = nextToDir;
		messageList.stream().forEach(mess->{
			File nextFileName = new File(fDir,mess.getMessageName() + "SnmpBuilder.java");
			StringBuffer buff = new StringBuffer();
			//
			//
			buff.append("package " + this.packagename + "." + nextPackName + ";\r\n");
			buff.append("public class " + mess.getMessageName() + "SnmpBuilder {\r\n");
			buff.append("    public final " + mess.getMessageName() + ".Builder instance;\r\n");
			buff.append("    private " + mess.getMessageName() + "SnmpBuilder() {\r\n");
			buff.append("        this.instance = " + mess.getMessageName() + ".newBuilder();\r\n");
			buff.append("    }\r\n");
			buff.append("    public static " + mess.getMessageName() + "SnmpBuilder newBuilder() {\r\n");
			buff.append("        return new " + mess.getMessageName() + "SnmpBuilder();\r\n");
			buff.append("    }\r\n");
			buff.append("    public " + mess.getMessageName() + " build() {\r\n");
			buff.append("        return this.instance.build();\r\n");
			buff.append("    }\r\n");
			buff.append("    //\r\n");
			buff.append("\r\n");
			//
			mess.createBuilderMessage(buff);
			//
			buff.append("\r\n");
			buff.append("    //\r\n");
			buff.append("}\r\n");
			// ファイル出力
	        try (FileWriter fw = new FileWriter(nextFileName, false);
	            BufferedWriter bw = new BufferedWriter(fw)) {
	            //
	            bw.write(buff.toString());
	            //
	        } catch (IOException ex) {
	        	System.out.println("Write error file=" + nextFileName);
	        }
	        //
	        //
	        //
	        nextFileName = new File(fDir,mess.getMessageName() + "SnmpWrapper.java");
	        buff = new StringBuffer();
			buff.append("package " + this.packagename + "." + nextPackName + ";\r\n");
			buff.append("public class " + mess.getMessageName() + "SnmpWrapper {\r\n");
			buff.append("    public " + mess.getMessageName() + " instance;\r\n");
			buff.append("    public " + mess.getMessageName() + "SnmpWrapper(" + mess.getMessageName() + " instance) {\r\n");
			buff.append("        this.instance = instance;\r\n");
			buff.append("    }\r\n");
			buff.append("    //\r\n");
			buff.append("\r\n");
			//
			mess.createWrapperMessage(buff);
			//
			buff.append("\r\n");
			buff.append("    //\r\n");

			buff.append("}\r\n");
			// ファイル出力
	        try (FileWriter fw = new FileWriter(nextFileName, false);
	            BufferedWriter bw = new BufferedWriter(fw)) {
	            //
	            bw.write(buff.toString());
	            //
	        } catch (IOException ex) {
	        	System.out.println("Write error file=" + nextFileName);
	        }

		});
	}
	
	/**
	 * 文字をクラス名っぽくする
	 * @param target 目標
	 * @return ターゲット
	 */
	public String chngeFileToClassName(String target) {
		boolean flag = true;
		StringBuffer ans = new StringBuffer();
		for (int i = 0 ; i < target.length(); i++) {
			char ch = target.charAt(i);
			if ((ch == '-') || (ch == '_')) {
				flag = true;
				continue;
			}
			if (flag) {
				ans.append(("" + ch).toUpperCase());
			} else {
				ans.append(("" + ch).toLowerCase());
			}
			flag = false;
		}
		return ans.toString();
	}
	/**
	 * 文字をクラス名っぽくする
	 * @param target 目標
	 * @return ターゲット
	 */
	public String changeToClassName(String target) {
		boolean flag = true;
		StringBuffer ans = new StringBuffer();
		if (0 < target.length()) {
			ans.append(("" + target.charAt(0)).toUpperCase());
			flag = false;
		}
		for (int i = 1 ; i < target.length(); i++) {
			char ch = target.charAt(i);
			if ((ch == '-') || (ch == '_')) {
				flag = true;
				continue;
			}
			if (flag) {
				ans.append(("" + ch).toUpperCase());
			} else {
				ans.append(ch);
			}
			flag = false;
		}
		return ans.toString();
	}

	/**
	 * 文字パッケージ名っぽくする
	 * @param target 目標
	 * @return ターゲット
	 */
	public String changePackageName(String target) {
		StringBuffer ans = new StringBuffer();
		for (int i = 0 ; i < target.length(); i++) {
			char ch = target.charAt(i);
			if ((ch == '-') || (ch == '_')) {
				continue;
			}
			ans.append(("" + ch).toLowerCase());
		}
		return ans.toString();
	}
	

	
	/**
	 * 読み込みできるか？
	 * @param key key
	 * @return result
	 */
	public boolean isRead(String key) {
		if (key == null) {
			return false;
		} else if (key.equals("not-accessible")) {
			return false;
		} else if (key.equals("accessible-for-notify")) {
			return false;
		} else if (key.equals("notify")) {
			return false;
		} else if (key.equals("install")) { // Slsnegotable etc
			return false;
		} else if (key.equals("install-notify")) {
			return false;
		} else if (key.equals("read-only")) {
			return true;
		} else if (key.equals("report-only")) {
			return true;
		} else if (key.equals("read-create")) {
			return true;
		} else if (key.equals("read-write")) {
			return true;
		} else if (key.equals("write-only")) {
			return false;
		}
		return false;
	}
	/**
	 * 書き込みできるか？
	 * @param key key
	 * @return result
	 */
	public boolean isWrite(String key) {
		if (key == null) {
			return false;
		} else if (key.equals("not-accessible")) {
			return false;
		} else if (key.equals("accessible-for-notify")) {
			return false;
		} else if (key.equals("notify")) {
			return false;
		} else if (key.equals("install")) { // Slsnegotable etc
			return false;
		} else if (key.equals("install-notify")) {
			return false;
		} else if (key.equals("read-only")) {
			return false;
		} else if (key.equals("report-only")) {
			return false;
		} else if (key.equals("read-create")) {
			return false;
		} else if (key.equals("read-write")) {
			return true;
		} else if (key.equals("write-only")) {
			return true;
		}
		return false;
	}
	
	/** コンフィグレーションファイル */
	private final Properties configuration;
	/** パッケージ名 */
	private String packagename;
	/** 出力先フォルダ名 */
	private File todirproto;
	/** 出力先フォルダ名 */
	private File todirjava;
	/** protoc の位置 */
	private File protoc;
	/** 出力する標的の正規表現 */
	private String targetreglex;

	/** 処理用のvisitor */
	private final FindOidVisitor visitor = new FindOidVisitor();
}
