package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfRcvAddressEntryIndexSnmpBuilder {
    public final IfRcvAddressEntryIndex.Builder instance;
    private IfRcvAddressEntryIndexSnmpBuilder() {
        this.instance = IfRcvAddressEntryIndex.newBuilder();
    }
    public static IfRcvAddressEntryIndexSnmpBuilder newBuilder() {
        return new IfRcvAddressEntryIndexSnmpBuilder();
    }
    public IfRcvAddressEntryIndex build() {
        return this.instance.build();
    }
    //

    public IfRcvAddressEntryIndexSnmpBuilder setIfIndex(org.snmp4j.smi.Integer32 value) { 
        instance.setIfIndex(value.getValue());
        return this;
    }
    public IfRcvAddressEntryIndexSnmpBuilder setIfRcvAddressAddress(org.snmp4j.smi.OctetString value) { 
        instance.setIfRcvAddressAddress(com.google.protobuf.ByteString.copyFrom(value.getValue()));
        return this;
    }

    //
}
