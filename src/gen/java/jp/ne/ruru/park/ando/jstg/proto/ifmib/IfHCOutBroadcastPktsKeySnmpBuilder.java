package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutBroadcastPktsKeySnmpBuilder {
    public final IfHCOutBroadcastPktsKey.Builder instance;
    private IfHCOutBroadcastPktsKeySnmpBuilder() {
        this.instance = IfHCOutBroadcastPktsKey.newBuilder();
    }
    public static IfHCOutBroadcastPktsKeySnmpBuilder newBuilder() {
        return new IfHCOutBroadcastPktsKeySnmpBuilder();
    }
    public IfHCOutBroadcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCOutBroadcastPktsKeySnmpBuilder setIfHCOutBroadcastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCOutBroadcastPkts(value.getValue());
        return this;
    }

    //
}
