package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInBroadcastPktsKeySnmpBuilder {
    public final IfHCInBroadcastPktsKey.Builder instance;
    private IfHCInBroadcastPktsKeySnmpBuilder() {
        this.instance = IfHCInBroadcastPktsKey.newBuilder();
    }
    public static IfHCInBroadcastPktsKeySnmpBuilder newBuilder() {
        return new IfHCInBroadcastPktsKeySnmpBuilder();
    }
    public IfHCInBroadcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfHCInBroadcastPktsKeySnmpBuilder setIfHCInBroadcastPkts(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCInBroadcastPkts(value.getValue());
        return this;
    }

    //
}
