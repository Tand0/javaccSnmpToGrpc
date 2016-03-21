package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCInOctetsKeySnmpBuilder {
    public final IfHCInOctetsKey.Builder instance;
    private IfHCInOctetsKeySnmpBuilder() {
        this.instance = IfHCInOctetsKey.newBuilder();
    }
    public static IfHCInOctetsKeySnmpBuilder newBuilder() {
        return new IfHCInOctetsKeySnmpBuilder();
    }
    public IfHCInOctetsKey build() {
        return this.instance.build();
    }
    //

    public IfHCInOctetsKeySnmpBuilder setIfHCInOctets(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCInOctets(value.getValue());
        return this;
    }

    //
}
