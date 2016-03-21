package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class LinkUpKeySnmpBuilder {
    public final LinkUpKey.Builder instance;
    private LinkUpKeySnmpBuilder() {
        this.instance = LinkUpKey.newBuilder();
    }
    public static LinkUpKeySnmpBuilder newBuilder() {
        return new LinkUpKeySnmpBuilder();
    }
    public LinkUpKey build() {
        return this.instance.build();
    }
    //

    public LinkUpKeySnmpBuilder setIfIndex(org.snmp4j.smi.Integer32 value) { 
        instance.setIfIndex(value.getValue());
        return this;
    }
    public LinkUpKeySnmpBuilder setIfAdminStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfAdminStatus(value.getValue());
        return this;
    }
    public LinkUpKeySnmpBuilder setIfOperStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfOperStatus(value.getValue());
        return this;
    }

    //
}
