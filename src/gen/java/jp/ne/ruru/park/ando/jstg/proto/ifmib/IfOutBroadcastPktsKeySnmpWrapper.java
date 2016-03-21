package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfOutBroadcastPktsKeySnmpWrapper {
    public IfOutBroadcastPktsKey instance;
    public IfOutBroadcastPktsKeySnmpWrapper(IfOutBroadcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter32 getIfOutBroadcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutBroadcastPkts());
    }

    //
}
