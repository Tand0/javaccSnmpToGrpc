package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInUcastPktsKeySnmpWrapper {
    public IfHCInUcastPktsKey instance;
    public IfHCInUcastPktsKeySnmpWrapper(IfHCInUcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCInUcastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCInUcastPkts());
    }

    //
}
