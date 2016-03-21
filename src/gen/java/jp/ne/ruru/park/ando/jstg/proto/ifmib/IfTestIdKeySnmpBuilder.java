package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestIdKeySnmpBuilder {
    public final IfTestIdKey.Builder instance;
    private IfTestIdKeySnmpBuilder() {
        this.instance = IfTestIdKey.newBuilder();
    }
    public static IfTestIdKeySnmpBuilder newBuilder() {
        return new IfTestIdKeySnmpBuilder();
    }
    public IfTestIdKey build() {
        return this.instance.build();
    }
    //

    public IfTestIdKeySnmpBuilder setIfTestId(org.snmp4j.smi.Integer32 value) { 
        instance.setIfTestId(value.getValue());
        return this;
    }

    //
}
