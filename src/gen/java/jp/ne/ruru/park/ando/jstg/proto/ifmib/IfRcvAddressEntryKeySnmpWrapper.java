package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfRcvAddressEntryKeySnmpWrapper {
    public IfRcvAddressEntryKey instance;
    public IfRcvAddressEntryKeySnmpWrapper(IfRcvAddressEntryKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfRcvAddressStatus() { 
        return new org.snmp4j.smi.Integer32(instance.getIfRcvAddressStatus());
    }
    public org.snmp4j.smi.OctetString getIfRcvAddressAddress() { 
        return new org.snmp4j.smi.OctetString(instance.getIfRcvAddressAddress().toByteArray());
    }

    //
}
