package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfLinkUpDownTrapEnableKeySnmpWrapper {
    public IfLinkUpDownTrapEnableKey instance;
    public IfLinkUpDownTrapEnableKeySnmpWrapper(IfLinkUpDownTrapEnableKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfLinkUpDownTrapEnable() { 
        return new org.snmp4j.smi.Integer32(instance.getIfLinkUpDownTrapEnable());
    }

    //
}
