package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfAliasKeySnmpBuilder {
    public final IfAliasKey.Builder instance;
    private IfAliasKeySnmpBuilder() {
        this.instance = IfAliasKey.newBuilder();
    }
    public static IfAliasKeySnmpBuilder newBuilder() {
        return new IfAliasKeySnmpBuilder();
    }
    public IfAliasKey build() {
        return this.instance.build();
    }
    //

    public IfAliasKeySnmpBuilder setIfAlias(String value) { 
        instance.setIfAlias(value);
        return this;
    }

    //
}
