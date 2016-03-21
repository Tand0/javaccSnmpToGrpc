package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class LinkDownKeySnmpBuilder {
    public final LinkDownKey.Builder instance;
    private LinkDownKeySnmpBuilder() {
        this.instance = LinkDownKey.newBuilder();
    }
    public static LinkDownKeySnmpBuilder newBuilder() {
        return new LinkDownKeySnmpBuilder();
    }
    public LinkDownKey build() {
        return this.instance.build();
    }
    //

    public LinkDownKeySnmpBuilder setIfIndex(org.snmp4j.smi.Integer32 value) { 
        instance.setIfIndex(value.getValue());
        return this;
    }
    public LinkDownKeySnmpBuilder setIfAdminStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfAdminStatus(value.getValue());
        return this;
    }
    public LinkDownKeySnmpBuilder setIfOperStatus(org.snmp4j.smi.Integer32 value) { 
        instance.setIfOperStatus(value.getValue());
        return this;
    }

    //
}
