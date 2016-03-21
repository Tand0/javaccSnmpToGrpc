package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackEntryKeySnmpBuilder {
    public final IfStackEntryKey.Builder instance;
    private IfStackEntryKeySnmpBuilder() {
        this.instance = IfStackEntryKey.newBuilder();
    }
    public static IfStackEntryKeySnmpBuilder newBuilder() {
        return new IfStackEntryKeySnmpBuilder();
    }
    public IfStackEntryKey build() {
        return this.instance.build();
    }
    //

    public IfStackEntryKeySnmpBuilder setIfStackLowerLayer(org.snmp4j.smi.Integer32 value) { 
        instance.setIfStackLowerLayer(value.getValue());
        return this;
    }
    public IfStackEntryKeySnmpBuilder setIfStackHigherLayer(org.snmp4j.smi.Integer32 value) { 
        instance.setIfStackHigherLayer(value.getValue());
        return this;
    }
    public IfStackEntryKeySnmpBuilder setIfStackStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfStackStatus(value.getValue());
        return this;
    }

    //
}
