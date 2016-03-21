package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestTypeKeySnmpWrapper {
    public IfTestTypeKey instance;
    public IfTestTypeKeySnmpWrapper(IfTestTypeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.OctetString getIfTestType() { 
        return new org.snmp4j.smi.OctetString(instance.getIfTestType().toByteArray());
    }

    //
}
