package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfEntryIndexSnmpBuilder {
    public final IfEntryIndex.Builder instance;
    private IfEntryIndexSnmpBuilder() {
        this.instance = IfEntryIndex.newBuilder();
    }
    public static IfEntryIndexSnmpBuilder newBuilder() {
        return new IfEntryIndexSnmpBuilder();
    }
    public IfEntryIndex build() {
        return this.instance.build();
    }
    //

    public IfEntryIndexSnmpBuilder setIfIndex(org.snmp4j.smi.Integer32 value) { 
        instance.setIfIndex(value.getValue());
        return this;
    }

    //
}
