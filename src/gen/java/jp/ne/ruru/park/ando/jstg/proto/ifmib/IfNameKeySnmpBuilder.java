package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfNameKeySnmpBuilder {
    public final IfNameKey.Builder instance;
    private IfNameKeySnmpBuilder() {
        this.instance = IfNameKey.newBuilder();
    }
    public static IfNameKeySnmpBuilder newBuilder() {
        return new IfNameKeySnmpBuilder();
    }
    public IfNameKey build() {
        return this.instance.build();
    }
    //

    public IfNameKeySnmpBuilder setIfName(String value) { 
        instance.setIfName(value);
        return this;
    }

    //
}
