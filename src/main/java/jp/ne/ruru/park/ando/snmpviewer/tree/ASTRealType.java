package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTRealType.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTRealType extends SimpleNode {
  public ASTRealType(int id) {
    super(id);
  }

  public ASTRealType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=547bf6da1f2a7f49983dfd7173127b69 (do not edit this line) */
