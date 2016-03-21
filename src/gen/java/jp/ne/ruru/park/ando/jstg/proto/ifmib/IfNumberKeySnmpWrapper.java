package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfNumberKeySnmpWrapper {
    public IfNumberKey instance;
    public IfNumberKeySnmpWrapper(IfNumberKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfNumber() { 
        return new org.snmp4j.smi.Integer32(instance.getIfNumber());
    }

    //
}
