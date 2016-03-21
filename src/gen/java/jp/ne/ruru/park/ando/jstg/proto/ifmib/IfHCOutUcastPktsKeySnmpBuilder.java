package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutUcastPktsKeySnmpBuilder {
    public final IfHCOutUcastPktsKey.Builder instance;
    private IfHCOutUcastPktsKeySnmpBuilder() {
        this.instance = IfHCOutUcastPktsKey.newBuilder();
    }
    public static IfHCOutUcastPktsKeySnmpBuilder newBuilder() {
        return new IfHCOutUcastPktsKeySnmpBuilder();
    }
    public IfHCOutUcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCOutUcastPktsKeySnmpBuilder setIfHCOutUcastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCOutUcastPkts(value.getValue());
        return this;
    }

    //
}
