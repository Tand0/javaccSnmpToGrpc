package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfPromiscuousModeKeySnmpBuilder {
    public final IfPromiscuousModeKey.Builder instance;
    private IfPromiscuousModeKeySnmpBuilder() {
        this.instance = IfPromiscuousModeKey.newBuilder();
    }
    public static IfPromiscuousModeKeySnmpBuilder newBuilder() {
        return new IfPromiscuousModeKeySnmpBuilder();
    }
    public IfPromiscuousModeKey build() {
        return this.instance.build();
    }
    //

    public IfPromiscuousModeKeySnmpBuilder setIfPromiscuousMode(org.snmp4j.smi.Integer32 value) { 
        instance.setIfPromiscuousMode(value.getValue());
        return this;
    }

    //
}
