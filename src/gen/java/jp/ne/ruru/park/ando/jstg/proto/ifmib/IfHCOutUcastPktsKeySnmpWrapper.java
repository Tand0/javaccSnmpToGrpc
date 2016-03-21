package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutUcastPktsKeySnmpWrapper {
    public IfHCOutUcastPktsKey instance;
    public IfHCOutUcastPktsKeySnmpWrapper(IfHCOutUcastPktsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCOutUcastPkts() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCOutUcastPkts());
    }

    //
}
