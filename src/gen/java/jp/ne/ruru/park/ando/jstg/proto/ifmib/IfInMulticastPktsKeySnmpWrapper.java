package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfInMulticastPktsKeySnmpWrapper {
    public IfInMulticastPktsKey instance;
    public IfInMulticastPktsKeySnmpWrapper(IfInMulticastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter32 getIfInMulticastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInMulticastPkts());
    }

    //
}
