package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfPromiscuousModeKeySnmpWrapper {
    public IfPromiscuousModeKey instance;
    public IfPromiscuousModeKeySnmpWrapper(IfPromiscuousModeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfPromiscuousMode() { 
        return new org.snmp4j.smi.Integer32(instance.getIfPromiscuousMode());
    }

    //
}
