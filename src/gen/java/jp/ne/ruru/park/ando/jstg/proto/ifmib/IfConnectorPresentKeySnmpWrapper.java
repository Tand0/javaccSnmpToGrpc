package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfConnectorPresentKeySnmpWrapper {
    public IfConnectorPresentKey instance;
    public IfConnectorPresentKeySnmpWrapper(IfConnectorPresentKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfConnectorPresent() { 
        return new org.snmp4j.smi.Integer32(instance.getIfConnectorPresent());
    }

    //
}
