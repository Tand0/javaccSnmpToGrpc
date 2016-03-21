package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfNumberKeySnmpBuilder {
    public final IfNumberKey.Builder instance;
    private IfNumberKeySnmpBuilder() {
        this.instance = IfNumberKey.newBuilder();
    }
    public static IfNumberKeySnmpBuilder newBuilder() {
        return new IfNumberKeySnmpBuilder();
    }
    public IfNumberKey build() {
        return this.instance.build();
    }
    //

    public IfNumberKeySnmpBuilder setIfNumber(org.snmp4j.smi.Integer32 value) { 
        instance.setIfNumber(value.getValue());
        return this;
    }

    //
}
