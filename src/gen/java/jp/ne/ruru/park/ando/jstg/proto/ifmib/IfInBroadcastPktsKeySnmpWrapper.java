package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfInBroadcastPktsKeySnmpWrapper {
    public IfInBroadcastPktsKey instance;
    public IfInBroadcastPktsKeySnmpWrapper(IfInBroadcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter32 getIfInBroadcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInBroadcastPkts());
    }

    //
}
