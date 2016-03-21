package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestTypeKeySnmpBuilder {
    public final IfTestTypeKey.Builder instance;
    private IfTestTypeKeySnmpBuilder() {
        this.instance = IfTestTypeKey.newBuilder();
    }
    public static IfTestTypeKeySnmpBuilder newBuilder() {
        return new IfTestTypeKeySnmpBuilder();
    }
    public IfTestTypeKey build() {
        return this.instance.build();
    }
    //

    public IfTestTypeKeySnmpBuilder setIfTestType(org.snmp4j.smi.OctetString value) { 
        instance.setIfTestType(com.google.protobuf.ByteString.copyFrom(value.getValue()));
        return this;
    }

    //
}
