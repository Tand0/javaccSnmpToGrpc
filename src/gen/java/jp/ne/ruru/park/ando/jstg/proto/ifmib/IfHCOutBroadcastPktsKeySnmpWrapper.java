package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutBroadcastPktsKeySnmpWrapper {
    public IfHCOutBroadcastPktsKey instance;
    public IfHCOutBroadcastPktsKeySnmpWrapper(IfHCOutBroadcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCOutBroadcastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCOutBroadcastPkts());
    }

    //
}
