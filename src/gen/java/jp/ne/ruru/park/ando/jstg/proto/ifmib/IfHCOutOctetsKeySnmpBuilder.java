package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfHCOutOctetsKeySnmpBuilder {
    public final IfHCOutOctetsKey.Builder instance;
    private IfHCOutOctetsKeySnmpBuilder() {
        this.instance = IfHCOutOctetsKey.newBuilder();
    }
    public static IfHCOutOctetsKeySnmpBuilder newBuilder() {
        return new IfHCOutOctetsKeySnmpBuilder();
    }
    public IfHCOutOctetsKey build() {
        return this.instance.build();
    }
    //

    public IfHCOutOctetsKeySnmpBuilder setIfHCOutOctets(org.snmp4j.smi.Counter64 value) { 
        instance.setIfHCOutOctets(value.getValue());
        return this;
    }

    //
}
