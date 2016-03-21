package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfRcvAddressEntryKeySnmpBuilder {
    public final IfRcvAddressEntryKey.Builder instance;
    private IfRcvAddressEntryKeySnmpBuilder() {
        this.instance = IfRcvAddressEntryKey.newBuilder();
    }
    public static IfRcvAddressEntryKeySnmpBuilder newBuilder() {
        return new IfRcvAddressEntryKeySnmpBuilder();
    }
    public IfRcvAddressEntryKey build() {
        return this.instance.build();
    }
    //

    public IfRcvAddressEntryKeySnmpBuilder setIfRcvAddressStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfRcvAddressStatus(value.getValue());
        return this;
    }
    public IfRcvAddressEntryKeySnmpBuilder setIfRcvAddressAddress(org.snmp4j.smi.OctetString value) { 
        instance.setIfRcvAddressAddress(com.google.protobuf.ByteString.copyFrom(value.getValue()));
        return this;
    }

    //
}
