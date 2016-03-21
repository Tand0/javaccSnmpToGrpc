package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfEntryKeySnmpBuilder {
    public final IfEntryKey.Builder instance;
    private IfEntryKeySnmpBuilder() {
        this.instance = IfEntryKey.newBuilder();
    }
    public static IfEntryKeySnmpBuilder newBuilder() {
        return new IfEntryKeySnmpBuilder();
    }
    public IfEntryKey build() {
        return this.instance.build();
    }
    //

    public IfEntryKeySnmpBuilder setIfIndex(org.snmp4j.smi.Integer32 value) { 
        instance.setIfIndex(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfType(org.snmp4j.smi.Integer32 value) { 
        instance.setIfType(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfMtu(org.snmp4j.smi.Integer32 value) { 
        instance.setIfMtu(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfPhysAddress(org.snmp4j.smi.OctetString value) { 
        instance.setIfPhysAddress(com.google.protobuf.ByteString.copyFrom(value.getValue()));
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInDiscards(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInDiscards(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutUcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutUcastPkts(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfSpeed(org.snmp4j.smi.Gauge32 value) { 
        instance.setIfSpeed(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInNUcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInNUcastPkts(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInErrors(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInErrors(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfDescr(String value) { 
        instance.setIfDescr(value);
        return this;
    }
    public IfEntryKeySnmpBuilder setIfLastChange(org.snmp4j.smi.TimeTicks value) { 
        instance.setIfLastChange(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutDiscards(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutDiscards(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutQLen(org.snmp4j.smi.Gauge32 value) { 
        instance.setIfOutQLen(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInUnknownProtos(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInUnknownProtos(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInUcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInUcastPkts(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutOctets(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutOctets(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfInOctets(org.snmp4j.smi.Counter32 value) { 
        instance.setIfInOctets(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutErrors(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutErrors(value.getValue());
        return this;
    }
    public IfEntryKeySnmpBuilder setIfOutNUcastPkts(org.snmp4j.smi.Counter32 value) { 
        instance.setIfOutNUcastPkts(value.getValue());
        return this;
    }

    //
}
