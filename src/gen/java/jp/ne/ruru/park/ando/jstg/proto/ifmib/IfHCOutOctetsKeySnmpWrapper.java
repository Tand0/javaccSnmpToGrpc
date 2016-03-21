package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutOctetsKeySnmpWrapper {
    public IfHCOutOctetsKey instance;
    public IfHCOutOctetsKeySnmpWrapper(IfHCOutOctetsKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Counter64 getIfHCOutOctets() { 
        return new org.snmp4j.smi.Counter64(instance.getIfHCOutOctets());
    }

    //
}
