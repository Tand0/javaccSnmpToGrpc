package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTableLastChangeKeySnmpWrapper {
    public IfTableLastChangeKey instance;
    public IfTableLastChangeKeySnmpWrapper(IfTableLastChangeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.TimeTicks getIfTableLastChange() { 
        return new org.snmp4j.smi.TimeTicks(instance.getIfTableLastChange());
    }

    //
}
