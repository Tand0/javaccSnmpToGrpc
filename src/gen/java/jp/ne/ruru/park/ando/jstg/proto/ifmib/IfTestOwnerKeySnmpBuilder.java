package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfTestOwnerKeySnmpBuilder {
    public final IfTestOwnerKey.Builder instance;
    private IfTestOwnerKeySnmpBuilder() {
        this.instance = IfTestOwnerKey.newBuilder();
    }
    public static IfTestOwnerKeySnmpBuilder newBuilder() {
        return new IfTestOwnerKeySnmpBuilder();
    }
    public IfTestOwnerKey build() {
        return this.instance.build();
    }
    //

    public IfTestOwnerKeySnmpBuilder setIfTestOwner(org.snmp4j.smi.OctetString value) { 
        instance.setIfTestOwner(com.google.protobuf.ByteString.copyFrom(value.getValue()));
        return this;
    }

    //
}
