package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfInMulticastPktsKeySnmpBuilder {
    public final IfInMulticastPktsKey.Builder instance;
    private IfInMulticastPktsKeySnmpBuilder() {
        this.instance = IfInMulticastPktsKey.newBuilder();
    }
    public static IfInMulticastPktsKeySnmpBuilder newBuilder() {
        return new IfInMulticastPktsKeySnmpBuilder();
    }
    public IfInMulticastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfInMulticastPktsKeySnmpBuilder setIfInMulticastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInMulticastPkts(value.getValue());
        return this;
    }

    //
}
