package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInOctetsKeySnmpWrapper {
    public IfHCInOctetsKey instance;
    public IfHCInOctetsKeySnmpWrapper(IfHCInOctetsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCInOctets() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCInOctets());
    }

    //
}
