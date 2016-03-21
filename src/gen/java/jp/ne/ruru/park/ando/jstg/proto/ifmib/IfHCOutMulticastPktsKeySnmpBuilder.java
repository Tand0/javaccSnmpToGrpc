package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutMulticastPktsKeySnmpBuilder {
    public final IfHCOutMulticastPktsKey.Builder instance;
    private IfHCOutMulticastPktsKeySnmpBuilder() {
        this.instance = IfHCOutMulticastPktsKey.newBuilder();
    }
    public static IfHCOutMulticastPktsKeySnmpBuilder newBuilder() {
        return new IfHCOutMulticastPktsKeySnmpBuilder();
    }
    public IfHCOutMulticastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCOutMulticastPktsKeySnmpBuilder setIfHCOutMulticastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCOutMulticastPkts(value.getValue());
        return this;
    }

    //
}
