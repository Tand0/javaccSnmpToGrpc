package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfEntryIndexSnmpWrapper {
    public IfEntryIndex instance;
    public IfEntryIndexSnmpWrapper(IfEntryIndex instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfIndex() { 
        return new org.snmp4j.smi.Integer32(instance.getIfIndex());
    }

    //
}
