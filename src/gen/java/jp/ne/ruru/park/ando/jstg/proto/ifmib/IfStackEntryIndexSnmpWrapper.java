package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackEntryIndexSnmpWrapper {
    public IfStackEntryIndex instance;
    public IfStackEntryIndexSnmpWrapper(IfStackEntryIndex instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfStackLowerLayer() { 
        return new org.snmp4j.smi.Integer32(instance.getIfStackLowerLayer());
    }
    public org.snmp4j.smi.Integer32 getIfStackHigherLayer() { 
        return new org.snmp4j.smi.Integer32(instance.getIfStackHigherLayer());
    }

    //
}
