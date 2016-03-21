package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInMulticastPktsKeySnmpWrapper {
    public IfHCInMulticastPktsKey instance;
    public IfHCInMulticastPktsKeySnmpWrapper(IfHCInMulticastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCInMulticastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCInMulticastPkts());
    }

    //
}
