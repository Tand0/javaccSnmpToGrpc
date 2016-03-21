package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestResultKeySnmpBuilder {
    public final IfTestResultKey.Builder instance;
    private IfTestResultKeySnmpBuilder() {
        this.instance = IfTestResultKey.newBuilder();
    }
    public static IfTestResultKeySnmpBuilder newBuilder() {
        return new IfTestResultKeySnmpBuilder();
    }
    public IfTestResultKey build() {
        return this.instance.build();
    }
    //

    public IfTestResultKeySnmpBuilder setIfTestResult(org.snmp4j.smi.Integer32 value) { 
        instance.setIfTestResult(value.getValue());
        return this;
    }

    //
}
