package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfInBroadcastPktsKeySnmpBuilder {
    public final IfInBroadcastPktsKey.Builder instance;
    private IfInBroadcastPktsKeySnmpBuilder() {
        this.instance = IfInBroadcastPktsKey.newBuilder();
    }
    public static IfInBroadcastPktsKeySnmpBuilder newBuilder() {
        return new IfInBroadcastPktsKeySnmpBuilder();
    }
    public IfInBroadcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfInBroadcastPktsKeySnmpBuilder setIfInBroadcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInBroadcastPkts(value.getValue());
        return this;
    }

    //
}
