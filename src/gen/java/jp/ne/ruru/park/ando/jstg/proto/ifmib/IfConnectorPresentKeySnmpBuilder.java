package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfConnectorPresentKeySnmpBuilder {
    public final IfConnectorPresentKey.Builder instance;
    private IfConnectorPresentKeySnmpBuilder() {
        this.instance = IfConnectorPresentKey.newBuilder();
    }
    public static IfConnectorPresentKeySnmpBuilder newBuilder() {
        return new IfConnectorPresentKeySnmpBuilder();
    }
    public IfConnectorPresentKey build() {
        return this.instance.build();
    }
    //

    public IfConnectorPresentKeySnmpBuilder setIfConnectorPresent(org.snmp4j.smi.Integer32 value) { 
        instance.setIfConnectorPresent(value.getValue());
        return this;
    }

    //
}
