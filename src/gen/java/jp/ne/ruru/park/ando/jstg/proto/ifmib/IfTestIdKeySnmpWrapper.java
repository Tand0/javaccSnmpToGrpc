package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestIdKeySnmpWrapper {
    public IfTestIdKey instance;
    public IfTestIdKeySnmpWrapper(IfTestIdKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfTestId() { 
        return new org.snmp4j.smi.Integer32(instance.getIfTestId());
    }

    //
}
