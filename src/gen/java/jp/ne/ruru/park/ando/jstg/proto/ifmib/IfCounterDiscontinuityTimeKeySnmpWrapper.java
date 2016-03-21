package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfCounterDiscontinuityTimeKeySnmpWrapper {
    public IfCounterDiscontinuityTimeKey instance;
    public IfCounterDiscontinuityTimeKeySnmpWrapper(IfCounterDiscontinuityTimeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.TimeTicks getIfCounterDiscontinuityTime() { 
        return new org.snmp4j.smi.TimeTicks(instance.getIfCounterDiscontinuityTime());
    }

    //
}
