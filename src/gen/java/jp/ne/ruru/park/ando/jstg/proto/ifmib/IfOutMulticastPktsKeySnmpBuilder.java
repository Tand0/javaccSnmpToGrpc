package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfOutMulticastPktsKeySnmpBuilder {
    public final IfOutMulticastPktsKey.Builder instance;
    private IfOutMulticastPktsKeySnmpBuilder() {
        this.instance = IfOutMulticastPktsKey.newBuilder();
    }
    public static IfOutMulticastPktsKeySnmpBuilder newBuilder() {
        return new IfOutMulticastPktsKeySnmpBuilder();
    }
    public IfOutMulticastPktsKey build() {
        return this.instance.build();
    }
    //

    public IfOutMulticastPktsKeySnmpBuilder setIfOutMulticastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutMulticastPkts(value.getValue());
        return this;
    }

    //
}
