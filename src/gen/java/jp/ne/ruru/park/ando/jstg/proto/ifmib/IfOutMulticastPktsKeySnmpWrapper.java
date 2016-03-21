package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfOutMulticastPktsKeySnmpWrapper {
    public IfOutMulticastPktsKey instance;
    public IfOutMulticastPktsKeySnmpWrapper(IfOutMulticastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter32 getIfOutMulticastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutMulticastPkts());
    }

    //
}
