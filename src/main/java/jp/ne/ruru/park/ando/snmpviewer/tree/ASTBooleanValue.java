package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTBooleanValue.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBooleanValue extends SimpleNode {
  public ASTBooleanValue(int id) {
    super(id);
  }

  public ASTBooleanValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a92d59670db962ae580eed1271cd54c2 (do not edit this line) */
