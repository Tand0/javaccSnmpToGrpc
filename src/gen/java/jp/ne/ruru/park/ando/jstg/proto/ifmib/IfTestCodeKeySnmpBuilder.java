package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestCodeKeySnmpBuilder {
    public final IfTestCodeKey.Builder instance;
    private IfTestCodeKeySnmpBuilder() {
        this.instance = IfTestCodeKey.newBuilder();
    }
    public static IfTestCodeKeySnmpBuilder newBuilder() {
        return new IfTestCodeKeySnmpBuilder();
    }
    public IfTestCodeKey build() {
        return this.instance.build();
    }
    //

    public IfTestCodeKeySnmpBuilder setIfTestCode(org.snmp4j.smi.OID value) { 
        int[] valueInt = value.getValue();
        for (int i = 0 ; i < valueInt.length ; i++) {
            instance.setIfTestCode(i,valueInt[i]);        }

        return this;
    }

    //
}
