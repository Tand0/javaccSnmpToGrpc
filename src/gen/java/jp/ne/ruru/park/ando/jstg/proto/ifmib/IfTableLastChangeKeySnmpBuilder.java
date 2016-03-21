package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTableLastChangeKeySnmpBuilder {
    public final IfTableLastChangeKey.Builder instance;
    private IfTableLastChangeKeySnmpBuilder() {
        this.instance = IfTableLastChangeKey.newBuilder();
    }
    public static IfTableLastChangeKeySnmpBuilder newBuilder() {
        return new IfTableLastChangeKeySnmpBuilder();
    }
    public IfTableLastChangeKey build() {
        return this.instance.build();
    }
    //

    public IfTableLastChangeKeySnmpBuilder setIfTableLastChange(org.snmp4j.smi.TimeTicks value) { 
        instance.setIfTableLastChange(value.getValue());
        return this;
    }

    //
}
