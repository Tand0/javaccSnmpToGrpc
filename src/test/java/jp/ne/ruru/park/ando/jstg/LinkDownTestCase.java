package jp.ne.ruru.park.ando.jstg;
import static org.junit.Assert.*;

import org.junit.Test;

import jp.ne.ruru.park.ando.jstg.proto.ifmib.LinkDownKey;
import jp.ne.ruru.park.ando.jstg.proto.ifmib.LinkDownKeySnmpBuilder;
import jp.ne.ruru.park.ando.jstg.proto.ifmib.LinkDownKeySnmpWrapper;

/** 
 * AsnParser test unit
 * @author foobar@em.boo.jp
 *
 */
public class LinkDownTestCase {
	/**
	 * constractor 
	 * @throws Exception exception
	 */
	public LinkDownTestCase() throws Exception {
	}
	/**
	 * Base Builder test.
	 */
	@Test
	public void testCompileBaseBuilder() {
		LinkDownKey key = LinkDownKey
				.newBuilder()
				.setIfIndex(1)
				.setIfAdminStatus(2)
				.setIfOperStatus(3)
				.build();
		//
		//
		//
		int ifIndex = key.getIfIndex();
		int ifAdmin = key.getIfAdminStatus();
		int ifOper  = key.getIfOperStatus();
		//
		assertEquals("ifIndex",ifIndex,1);
		assertEquals("ifAdminStatus",ifAdmin,2);
		assertEquals("ifOperStatus",ifOper,3);
	}

	/**
	 * Snmp Builder test.
	 */
	@Test
	public void testCompileSnmpBuilder() {
		LinkDownKey key = LinkDownKeySnmpBuilder
				.newBuilder()
				.setIfIndex(new org.snmp4j.smi.Integer32(1))
				.setIfAdminStatus(new org.snmp4j.smi.Integer32(2))
				.setIfOperStatus(new org.snmp4j.smi.Integer32(3))
				.build();
		//
		int ifIndex = key.getIfIndex();
		int ifAdmin = key.getIfAdminStatus();
		int ifOper  = key.getIfOperStatus();
		//
		assertEquals("ifIndex",ifIndex,1);
		assertEquals("ifAdminStatus",ifAdmin,2);
		assertEquals("ifOperStatus",ifOper,3);
	}
	
	/**
	 * Wrapper test.
	 */
	@Test
	public void testCompileSnmpWrapper() {
		LinkDownKey work = LinkDownKey
				.newBuilder()
				.setIfIndex(1)
				.setIfAdminStatus(2)
				.setIfOperStatus(3)
				.build();
		LinkDownKeySnmpWrapper key = new LinkDownKeySnmpWrapper(work);
		//
		org.snmp4j.smi.Integer32 ifIndex = key.getIfIndex();
		org.snmp4j.smi.Integer32 ifAdmin = key.getIfAdminStatus();
		org.snmp4j.smi.Integer32 ifOper  = key.getIfOperStatus();
		//
		assertEquals("ifIndex",ifIndex.getValue(),1);
		assertEquals("ifAdminStatus",ifAdmin.getValue(),2);
		assertEquals("ifOperStatus",ifOper.getValue(),3);
	}

}
