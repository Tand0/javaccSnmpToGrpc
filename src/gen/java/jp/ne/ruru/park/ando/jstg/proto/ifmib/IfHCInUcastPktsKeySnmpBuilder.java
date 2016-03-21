package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInUcastPktsKeySnmpBuilder {
    public final IfHCInUcastPktsKey.Builder instance;
    private IfHCInUcastPktsKeySnmpBuilder() {
        this.instance = IfHCInUcastPktsKey.newBuilder();
    }
    public static IfHCInUcastPktsKeySnmpBuilder newBuilder() {
        return new IfHCInUcastPktsKeySnmpBuilder();
    }
    public IfHCInUcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCInUcastPktsKeySnmpBuilder setIfHCInUcastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCInUcastPkts(value.getValue());
        return this;
    }

    //
}
