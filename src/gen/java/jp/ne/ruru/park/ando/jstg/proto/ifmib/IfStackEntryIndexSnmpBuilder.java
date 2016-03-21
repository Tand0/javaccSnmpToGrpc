package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfStackEntryIndexSnmpBuilder {
    public final IfStackEntryIndex.Builder instance;
    private IfStackEntryIndexSnmpBuilder() {
        this.instance = IfStackEntryIndex.newBuilder();
    }
    public static IfStackEntryIndexSnmpBuilder newBuilder() {
        return new IfStackEntryIndexSnmpBuilder();
    }
    public IfStackEntryIndex build() {
        return this.instance.build();
    }
    //

    public IfStackEntryIndexSnmpBuilder setIfStackLowerLayer(org.snmp4j.smi.Integer32 value) { 
        instance.setIfStackLowerLayer(value.getValue());
        return this;
    }
    public IfStackEntryIndexSnmpBuilder setIfStackHigherLayer(org.snmp4j.smi.Integer32 value) { 
        instance.setIfStackHigherLayer(value.getValue());
        return this;
    }

    //
}
