package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackLastChangeKeySnmpBuilder {
    public final IfStackLastChangeKey.Builder instance;
    private IfStackLastChangeKeySnmpBuilder() {
        this.instance = IfStackLastChangeKey.newBuilder();
    }
    public static IfStackLastChangeKeySnmpBuilder newBuilder() {
        return new IfStackLastChangeKeySnmpBuilder();
    }
    public IfStackLastChangeKey build() {
        return this.instance.build();
    }
    //

    public IfStackLastChangeKeySnmpBuilder setIfStackLastChange(org.snmp4j.smi.TimeTicks value) { 
        instance.setIfStackLastChange(value.getValue());
        return this;
    }

    //
}
