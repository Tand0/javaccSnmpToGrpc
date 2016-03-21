package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfLinkUpDownTrapEnableKeySnmpBuilder {
    public final IfLinkUpDownTrapEnableKey.Builder instance;
    private IfLinkUpDownTrapEnableKeySnmpBuilder() {
        this.instance = IfLinkUpDownTrapEnableKey.newBuilder();
    }
    public static IfLinkUpDownTrapEnableKeySnmpBuilder newBuilder() {
        return new IfLinkUpDownTrapEnableKeySnmpBuilder();
    }
    public IfLinkUpDownTrapEnableKey build() {
        return this.instance.build();
    }
    //

    public IfLinkUpDownTrapEnableKeySnmpBuilder setIfLinkUpDownTrapEnable(org.snmp4j.smi.Integer32 value) { 
        instance.setIfLinkUpDownTrapEnable(value.getValue());
        return this;
    }

    //
}
