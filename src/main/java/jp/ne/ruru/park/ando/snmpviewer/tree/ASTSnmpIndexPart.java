package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTSnmpIndexPart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSnmpIndexPart extends SimpleNode {
  public ASTSnmpIndexPart(int id) {
    super(id);
  }

  public ASTSnmpIndexPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d9ec232f72849fa98b4efb1cf8787376 (do not edit this line) */
