package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfAliasKeySnmpWrapper {
    public IfAliasKey instance;
    public IfAliasKeySnmpWrapper(IfAliasKey instance) {
        this.instance = instance;
    }
    //

    public String getIfAlias() { 
        return instance.getIfAlias();
    }

    //
}
