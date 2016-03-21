package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHighSpeedKeySnmpWrapper {
    public IfHighSpeedKey instance;
    public IfHighSpeedKeySnmpWrapper(IfHighSpeedKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Gauge32 getIfHighSpeed() { 
        return new org.snmp4j.smi.Gauge32(instance.getIfHighSpeed());
    }

    //
}
