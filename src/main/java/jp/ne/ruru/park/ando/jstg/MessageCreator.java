package jp.ne.ruru.park.ando.jstg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageCreator {
	public MessageCreator(String messageName) {
		this.messageName = messageName;
		this.keyMap = new HashMap<String,String>();
	}
	public void createMessage(StringBuffer buff) {
		buff.append("message " + messageName + " {\r\n");
		int p = 1;
		for (Map.Entry<String,String> valueMapEntry : keyMap.entrySet()) {
			String key = valueMapEntry.getKey();
			String type = valueMapEntry.getValue();
			String proType = getNameToProtocType(type);
			buff.append("  " + proType + " " + key + " = " + p + "; // " + type + "\r\n");
			p++;
		}
		buff.append("}\r\n");
	}
	public void createBuilderMessage(StringBuffer buff) {
		keyMap.entrySet().stream().forEachOrdered(entry-> {
			String key = entry.getKey();
			String upperKey = this.changeToMethodName(key);
			String value = entry.getValue();
			String scale4j = getNameTo4j(value);
			buff.append("    public ").append(messageName).append("SnmpBuilder set").append(upperKey).append("(");
			buff.append(scale4j);
			buff.append(" value) { \r\n");
			buff.append("        ").append(get4JTChange(key,upperKey,scale4j)).append("\r\n");
			buff.append("        return this;\r\n");
			buff.append("    }\r\n");
		});
	}
	public void createWrapperMessage(StringBuffer buff) {
		keyMap.entrySet().stream().forEachOrdered(entry-> {
			String key = entry.getKey();
			String upperKey = this.changeToMethodName(key);
			String value = entry.getValue();
			String scale4j = getNameTo4j(value);
			buff.append("    public ").append(scale4j).append(" get").append(upperKey).append("() { \r\n");
			buff.append(getTo4jTogRPCReturn(upperKey,scale4j));
			buff.append("    }\r\n");
		});
	}

	public String getMessageName() {
		return this.messageName;
	}
	public void addKeyType(String key,String type) {
		keyMap.put(key,type);
	}
	public void removeAll(List<String> keyList) {
		keyList.stream().forEach(key->keyMap.remove(key));
	}
	/**
	 * 名前からSNMP4jへの文字へ変換する
	 * @param name
	 */
	protected String getNameTo4j(String name) {
		if (name == null) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("DisplayString")) {
			return "String";
		} else if (name.equals("AutonomousType")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("OBJECT IDENTIFIER")) {
			return "org.snmp4j.smi.OID";
		} else if (name.equals("OCTET STRING")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("Opaque")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("INTEGER")) {
			return "org.snmp4j.smi.Integer32";
		} else if (name.equals("IANAifType")) {
			return "org.snmp4j.smi.Integer32";
		} else if (name.equals("IANAtunnelType")) {
			return "org.snmp4j.smi.Integer64";
		} else if (name.equals("Integer")) {
			return "org.snmp4j.smi.Integer32";			
		} else if (name.equals("Integer32")) {
			return "org.snmp4j.smi.Integer32";			
		} else if (name.equals("Integer64")) {
			return "org.snmp4j.smi.Counter64";			
		} else if (name.equals("Unsigned")) {
			return "org.snmp4j.smi.UnsignedInteger32";			
		} else if (name.equals("Unsigned32")) {
			return "org.snmp4j.smi.UnsignedInteger32";			
		} else if (name.equals("Unsigned64")) {
			return "org.snmp4j.smi.Counter64";			
		} else if (name.equals("Counter")) {
			return "org.snmp4j.smi.Counter32";			
		} else if (name.equals("Counter32")) {
			return "org.snmp4j.smi.Counter32";			
		} else if (name.equals("Counter64")) {
			return "org.snmp4j.smi.Counter64";			
		} else if (name.equals("Gauge")) {
			return "org.snmp4j.smi.Gauge32";			
		} else if (name.equals("Gauge32")) {
			return "org.snmp4j.smi.Gauge32";			
		} else if (name.equals("Gauge64")) {
			return "org.snmp4j.smi.Counter64";			
		} else if (name.equals("TimeTicks")) {
			return "org.snmp4j.smi.TimeTicks";
		} else if (name.equals("InetAddressIPv6")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("IpAddress")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("InetAddress")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("BITS")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("PhysAddress")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("MacAddress")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("TruthValue")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("TestAndIncr")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("AutonomousType")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("InstancePointer")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("CHOICE")) {
			return "org.snmp4j.smi.OctetString";
		} else if (name.equals("table")) {
			return "org.snmp4j.smi.OctetString";
		}
		return "org.snmp4j.smi.OctetString";
	}
	/**
	 * 名前からSNMP4jへの文字へ変換する
	 * @param name
	 */
	protected String get4JTChange(String key,String upperKey,String name) {
		if (name == null) {
			return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
		} else if (name.equals("org.snmp4j.smi.OctetString")) {
			return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
		} else if (name.equals("org.snmp4j.smi.Counter32")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.Counter64")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.Gauge32")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.Integer32")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.Null")) {
			//none
		} else if (name.equals("String")) {
			return "instance.set" + upperKey + "(value);";
		} else if (name.equals("org.snmp4j.smi.OctetString")) {
			return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
		} else if (name.equals("org.snmp4j.smi.OID")) {	
	    	return "int[] valueInt = value.getValue();\r\n"
	    	+ "        for (int i = 0 ; i < valueInt.length ; i++) {\r\n"
	    	+ "            instance.set" + upperKey + "(i,valueInt[i]);"
	    	+ "        }\r\n";
		} else if (name.equals("org.snmp4j.smi.Opaque")) {
			return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
		} else if (name.equals("org.snmp4j.smi.TimeTicks")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.UnsignedInteger32")) {
			return "instance.set" + upperKey + "(value.getValue());";
		} else if (name.equals("org.snmp4j.smi.VariantVariable")) {
			return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
		}
		return "instance.set" + upperKey + "(com.google.protobuf.ByteString.copyFrom(value.getValue()));";
	}

	/**
	 * SNMP4jから戻り値へ変換する
	 * @param name
	 */
	protected String getTo4jTogRPCReturn(String upperKey,String name) {
		if (name == null) {
			return "        return new org.snmp4j.smi.OctetString(instance.get" + upperKey+ "().toByteArray());\r\n";
		} else if (name.equals("org.snmp4j.smi.BitString")) {
			return "        return new org.snmp4j.smi.OctetString(instance.get" + upperKey+ "().toByteArray());\r\n";
		} else if (name.equals("org.snmp4j.smi.Counter32")) {
			return "        return new org.snmp4j.smi.Counter32(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.Counter64")) {
			return "        return new org.snmp4j.smi.Counter64(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.Gauge32")) {
			return "        return new org.snmp4j.smi.Gauge32(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.Integer32")) {
			return "        return new org.snmp4j.smi.Integer32(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.Null")) {
			//none
		} else if (name.equals("String")) {
			return "        return instance.get" + upperKey+ "();\r\n";
		} else if (name.equals("org.snmp4j.smi.OctetString")) {
			return "        return new org.snmp4j.smi.OctetString(instance.get" + upperKey+ "().toByteArray());\r\n";
		} else if (name.equals("org.snmp4j.smi.OID")) {	
	    	return 
	    	  "        int[] valueInt = new int[instance.get" + upperKey+ "Count()];\r\n"
	    	+ "        for (int i = 0 ; i < valueInt.length ; i++) {\r\n"
	    	+ "            valueInt[i]  = instance.get" + upperKey+ "(i);\r\n"
	    	+ "        }\r\n"
	    	+ "        return new org.snmp4j.smi.OID(valueInt);\r\n";
		} else if (name.equals("org.snmp4j.smi.Opaque")) {
			return  "        return new org.snmp4j.smi.Opaque(instance.get" + upperKey+ "().toByteArray());\r\n";
		} else if (name.equals("org.snmp4j.smi.TimeTicks")) {
			return "        return new org.snmp4j.smi.TimeTicks(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.UnsignedInteger32")) {
			return "        return new org.snmp4j.smi.UnsignedInteger32(instance.get" + upperKey+ "());\r\n";
		} else if (name.equals("org.snmp4j.smi.VariantVariable")) {
			return "        return new org.snmp4j.smi.VariantVariable(instance.get" + upperKey+ "().toByteArray());\r\n";
		}
		return "        return new org.snmp4j.smi.OctetString(instance.get" + upperKey+ "().toByteArray());\r\n";
	}

	/**
	 * 名前からprotocol buffersの文字へ変換する
	 * @param name
	 */
	protected String getNameToProtocType(String name) {
		if (name == null) {
			return "bytes";
		} else if (name.equals("DisplayString")) {
			return "string";
		} else if (name.equals("AutonomousType")) {
			return "bytes";
		} else if (name.equals("OBJECT IDENTIFIER")) {
			return "repeated uint32";
		} else if (name.equals("OCTET STRING")) {
			return "bytes";
		} else if (name.equals("Opaque")) {
			return "bytes";
		} else if (name.equals("INTEGER")) {
			return "int32";
		} else if (name.equals("IANAifType")) {
			return "int32";
		} else if (name.equals("IANAtunnelType")) {
			return "int64";
		} else if (name.equals("Integer")) {
			return "int32";			
		} else if (name.equals("Integer32")) {
			return "int32";			
		} else if (name.equals("Integer64")) {
			return "int64";			
		} else if (name.equals("Unsigned")) {
			return "uint64";			
		} else if (name.equals("Unsigned32")) {
			return "uint64";			
		} else if (name.equals("Unsigned64")) {
			return "uint64";			
		} else if (name.equals("Counter")) {
			return "uint64";			
		} else if (name.equals("Counter32")) {
			return "uint64";			
		} else if (name.equals("Counter64")) {
			return "uint64";			
		} else if (name.equals("Gauge")) {
			return "uint64";			
		} else if (name.equals("Gauge32")) {
			return "uint64";			
		} else if (name.equals("Gauge64")) {
			return "uint64";			
		} else if (name.equals("TimeTicks")) {
			return "uint64";
		} else if (name.equals("InetAddressIPv6")) {
			return "bytes";
		} else if (name.equals("IpAddress")) {
			return "bytes";
		} else if (name.equals("InetAddress")) {
			return "bytes";
		} else if (name.equals("BITS")) {
			return "bytes";
		} else if (name.equals("PhysAddress")) {
			return "bytes";
		} else if (name.equals("MacAddress")) {
			return "bytes";
		} else if (name.equals("TruthValue")) {
			return "bytes";
		} else if (name.equals("TestAndIncr")) {
			return "bytes";
		} else if (name.equals("AutonomousType")) {
			return "bytes";
		} else if (name.equals("InstancePointer")) {
			return "bytes";
		} else if (name.equals("CHOICE")) {
			return "bytes";
		} else if (name.equals("table")) {
			return "bytes";
		}
		return "bytes";
	}
	/**
	 * topToUpperCase
	 * @param target target
	 * @return result;
	 */
	protected String changeToMethodName(String target) {
		StringBuffer ans = new StringBuffer();
		boolean flag = true;
		for (int i = 0 ; i < target.length(); i++) {
			char ch = target.charAt(i);
			if (('0' <= ch) && (ch <= '9')) {
				flag = true;
				ans.append(ch);
			} else if (flag) {
				ans.append(("" + ch).toUpperCase());
				flag = false;
			} else {
				ans.append(ch);
			}
		}
		return ans.toString();
	}

	private final String messageName;
	private final Map<String,String> keyMap;
	
}
