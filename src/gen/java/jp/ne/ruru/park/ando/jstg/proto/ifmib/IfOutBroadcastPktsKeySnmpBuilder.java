package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfOutBroadcastPktsKeySnmpBuilder {
    public final IfOutBroadcastPktsKey.Builder instance;
    private IfOutBroadcastPktsKeySnmpBuilder() {
        this.instance = IfOutBroadcastPktsKey.newBuilder();
    }
    public static IfOutBroadcastPktsKeySnmpBuilder newBuilder() {
        return new IfOutBroadcastPktsKeySnmpBuilder();
    }
    public IfOutBroadcastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfOutBroadcastPktsKeySnmpBuilder setIfOutBroadcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutBroadcastPkts(value.getValue());
        return this;
    }

    //
}
