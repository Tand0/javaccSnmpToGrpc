package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackLastChangeKeySnmpWrapper {
    public IfStackLastChangeKey instance;
    public IfStackLastChangeKeySnmpWrapper(IfStackLastChangeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.TimeTicks getIfStackLastChange() { 
        return new org.snmp4j.smi.TimeTicks(instance.getIfStackLastChange());
    }

    //
}
