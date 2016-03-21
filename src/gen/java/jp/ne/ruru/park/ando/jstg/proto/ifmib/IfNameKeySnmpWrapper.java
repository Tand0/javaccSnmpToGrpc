package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfNameKeySnmpWrapper {
    public IfNameKey instance;
    public IfNameKeySnmpWrapper(IfNameKey instance) {
        this.instance = instance;
    }
    //

    public String getIfName() { 
        return instance.getIfName();
    }

    //
}
