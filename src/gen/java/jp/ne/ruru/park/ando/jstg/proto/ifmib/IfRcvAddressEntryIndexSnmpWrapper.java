package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfRcvAddressEntryIndexSnmpWrapper {
    public IfRcvAddressEntryIndex instance;
    public IfRcvAddressEntryIndexSnmpWrapper(IfRcvAddressEntryIndex instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfIndex() { 
        return new org.snmp4j.smi.Integer32(instance.getIfIndex());
    }
    public org.snmp4j.smi.OctetString getIfRcvAddressAddress() { 
        return new org.snmp4j.smi.OctetString(instance.getIfRcvAddressAddress().toByteArray());
    }

    //
}
