package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackEntryKeySnmpWrapper {
    public IfStackEntryKey instance;
    public IfStackEntryKeySnmpWrapper(IfStackEntryKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfStackLowerLayer() { 
        return new org.snmp4j.smi.Integer32(instance.getIfStackLowerLayer());
    }
    public org.snmp4j.smi.Integer32 getIfStackHigherLayer() { 
        return new org.snmp4j.smi.Integer32(instance.getIfStackHigherLayer());
    }
    public org.snmp4j.smi.Integer32 getIfStackStatus() { 
        return new org.snmp4j.smi.Integer32(instance.getIfStackStatus());
    }

    //
}
