package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestStatusKeySnmpWrapper {
    public IfTestStatusKey instance;
    public IfTestStatusKeySnmpWrapper(IfTestStatusKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfTestStatus() { 
        return new org.snmp4j.smi.Integer32(instance.getIfTestStatus());
    }

    //
}
