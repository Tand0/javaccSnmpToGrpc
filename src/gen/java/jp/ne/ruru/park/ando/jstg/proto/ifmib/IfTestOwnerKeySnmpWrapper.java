package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestOwnerKeySnmpWrapper {
    public IfTestOwnerKey instance;
    public IfTestOwnerKeySnmpWrapper(IfTestOwnerKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.OctetString getIfTestOwner() { 
        return new org.snmp4j.smi.OctetString(instance.getIfTestOwner().toByteArray());
    }

    //
}
