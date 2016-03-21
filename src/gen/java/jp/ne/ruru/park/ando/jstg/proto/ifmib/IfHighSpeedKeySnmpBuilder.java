package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHighSpeedKeySnmpBuilder {
    public final IfHighSpeedKey.Builder instance;
    private IfHighSpeedKeySnmpBuilder() {
        this.instance = IfHighSpeedKey.newBuilder();
    }
    public static IfHighSpeedKeySnmpBuilder newBuilder() {
        return new IfHighSpeedKeySnmpBuilder();
    }
    public IfHighSpeedKey build() {
        return this.instance.build();
    }
    //

    public IfHighSpeedKeySnmpBuilder setIfHighSpeed(org.snmp4j.smi.Gauge32 value) { 
        instance.setIfHighSpeed(value.getValue());
        return this;
    }

    //
}
