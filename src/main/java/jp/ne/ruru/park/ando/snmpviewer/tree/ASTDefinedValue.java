package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTDefinedValue.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDefinedValue extends SimpleNode {
  public ASTDefinedValue(int id) {
    super(id);
  }

  public ASTDefinedValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=15d118e35e13ff0bb75d85f10a8578d5 (do not edit this line) */
