package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class LinkDownKeySnmpWrapper {
    public LinkDownKey instance;
    public LinkDownKeySnmpWrapper(LinkDownKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfIndex() { 
        return new org.snmp4j.smi.Integer32(instance.getIfIndex());
    }
    public org.snmp4j.smi.Integer32 getIfAdminStatus() { 
        return new org.snmp4j.smi.Integer32(instance.getIfAdminStatus());
    }
    public org.snmp4j.smi.Integer32 getIfOperStatus() { 
        return new org.snmp4j.smi.Integer32(instance.getIfOperStatus());
    }

    //
}
