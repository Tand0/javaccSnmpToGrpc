package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTMacroReference.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMacroReference extends SimpleNode {
  public ASTMacroReference(int id) {
    super(id);
  }

  public ASTMacroReference(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=18fd9ca3369c52d906b92dab71696c29 (do not edit this line) */
