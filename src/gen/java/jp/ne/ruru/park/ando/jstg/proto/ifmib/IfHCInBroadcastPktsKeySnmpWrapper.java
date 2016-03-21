package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInBroadcastPktsKeySnmpWrapper {
    public IfHCInBroadcastPktsKey instance;
    public IfHCInBroadcastPktsKeySnmpWrapper(IfHCInBroadcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCInBroadcastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCInBroadcastPkts());
    }

    //
}
