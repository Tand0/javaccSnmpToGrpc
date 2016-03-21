package jp.ne.ruru.park.ando.jstg.proto.ifmib;
public class IfEntryKeySnmpWrapper {
    public IfEntryKey instance;
    public IfEntryKeySnmpWrapper(IfEntryKey instance) {
        this.instance = instance;
    }
    //

    public org.snmp4j.smi.Integer32 getIfIndex() { 
        return new org.snmp4j.smi.Integer32(instance.getIfIndex());
    }
    public org.snmp4j.smi.Integer32 getIfType() { 
        return new org.snmp4j.smi.Integer32(instance.getIfType());
    }
    public org.snmp4j.smi.Integer32 getIfMtu() { 
        return new org.snmp4j.smi.Integer32(instance.getIfMtu());
    }
    public org.snmp4j.smi.OctetString getIfPhysAddress() { 
        return new org.snmp4j.smi.OctetString(instance.getIfPhysAddress().toByteArray());
    }
    public org.snmp4j.smi.Counter32 getIfInDiscards() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInDiscards());
    }
    public org.snmp4j.smi.Counter32 getIfOutUcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutUcastPkts());
    }
    public org.snmp4j.smi.Gauge32 getIfSpeed() { 
        return new org.snmp4j.smi.Gauge32(instance.getIfSpeed());
    }
    public org.snmp4j.smi.Counter32 getIfInNUcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInNUcastPkts());
    }
    public org.snmp4j.smi.Counter32 getIfInErrors() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInErrors());
    }
    public String getIfDescr() { 
        return instance.getIfDescr();
    }
    public org.snmp4j.smi.TimeTicks getIfLastChange() { 
        return new org.snmp4j.smi.TimeTicks(instance.getIfLastChange());
    }
    public org.snmp4j.smi.Counter32 getIfOutDiscards() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutDiscards());
    }
    public org.snmp4j.smi.Gauge32 getIfOutQLen() { 
        return new org.snmp4j.smi.Gauge32(instance.getIfOutQLen());
    }
    public org.snmp4j.smi.Counter32 getIfInUnknownProtos() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInUnknownProtos());
    }
    public org.snmp4j.smi.Counter32 getIfInUcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInUcastPkts());
    }
    public org.snmp4j.smi.Counter32 getIfOutOctets() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutOctets());
    }
    public org.snmp4j.smi.Counter32 getIfInOctets() { 
        return new org.snmp4j.smi.Counter32(instance.getIfInOctets());
    }
    public org.snmp4j.smi.Counter32 getIfOutErrors() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutErrors());
    }
    public org.snmp4j.smi.Counter32 getIfOutNUcastPkts() { 
        return new org.snmp4j.smi.Counter32(instance.getIfOutNUcastPkts());
    }

    //
}
