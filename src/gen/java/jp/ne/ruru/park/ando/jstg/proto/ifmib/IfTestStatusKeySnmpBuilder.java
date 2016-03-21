package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestStatusKeySnmpBuilder {
    public final IfTestStatusKey.Builder instance;
    private IfTestStatusKeySnmpBuilder() {
        this.instance = IfTestStatusKey.newBuilder();
    }
    public static IfTestStatusKeySnmpBuilder newBuilder() {
        return new IfTestStatusKeySnmpBuilder();
    }
    public IfTestStatusKey build() {
        return this.instance.build();
    }
    //

    public IfTestStatusKeySnmpBuilder setIfTestStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfTestStatus(value.getValue());
        return this;
    }

    //
}
