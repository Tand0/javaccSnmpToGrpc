package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestResultKeySnmpWrapper {
    public IfTestResultKey instance;
    public IfTestResultKeySnmpWrapper(IfTestResultKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfTestResult() { 
        return new org.snmp4j.smi.Integer32(instance.getIfTestResult());
    }

    //
}
