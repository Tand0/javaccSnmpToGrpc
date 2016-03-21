package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInMulticastPktsKeySnmpBuilder {
    public final IfHCInMulticastPktsKey.Builder instance;
    private IfHCInMulticastPktsKeySnmpBuilder() {
        this.instance = IfHCInMulticastPktsKey.newBuilder();
    }
    public static IfHCInMulticastPktsKeySnmpBuilder newBuilder() {
        return new IfHCInMulticastPktsKeySnmpBuilder();
    }
    public IfHCInMulticastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCInMulticastPktsKeySnmpBuilder setIfHCInMulticastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCInMulticastPkts(value.getValue());
        return this;
    }

    //
}
