package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestCodeKeySnmpWrapper {
    public IfTestCodeKey instance;
    public IfTestCodeKeySnmpWrapper(IfTestCodeKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.OID getIfTestCode() { 
        int[] valueInt = new int[instance.getIfTestCodeCount()];
        for (int i = 0 ; i < valueInt.length ; i++) {
            valueInt[i]  = instance.getIfTestCode(i);
        }
        return new org.snmp4j.smi.OID(valueInt);
    }

    //
}
