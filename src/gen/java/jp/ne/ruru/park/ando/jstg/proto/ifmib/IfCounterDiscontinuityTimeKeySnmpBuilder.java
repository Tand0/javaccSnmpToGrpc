package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfCounterDiscontinuityTimeKeySnmpBuilder {
    public final IfCounterDiscontinuityTimeKey.Builder instance;
    private IfCounterDiscontinuityTimeKeySnmpBuilder() {
        this.instance = IfCounterDiscontinuityTimeKey.newBuilder();
    }
    public static IfCounterDiscontinuityTimeKeySnmpBuilder newBuilder() {
        return new IfCounterDiscontinuityTimeKeySnmpBuilder();
    }
    public IfCounterDiscontinuityTimeKey build() {
        return this.instance.build();
    }
    //

    public IfCounterDiscontinuityTimeKeySnmpBuilder setIfCounterDiscontinuityTime(org.snmp4j.smi.TimeTicks value) { 
        instance.setIfCounterDiscontinuityTime(value.getValue());
        return this;
    }

    //
}
