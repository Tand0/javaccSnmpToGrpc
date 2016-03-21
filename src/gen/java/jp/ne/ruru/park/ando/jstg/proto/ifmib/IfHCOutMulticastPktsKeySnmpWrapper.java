package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutMulticastPktsKeySnmpWrapper {
    public IfHCOutMulticastPktsKey instance;
    public IfHCOutMulticastPktsKeySnmpWrapper(IfHCOutMulticastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCOutMulticastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCOutMulticastPkts());
    }

    //
}
