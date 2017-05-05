package jUnitTestStage2;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Marina;

public class MarinaAddressTest {

	@Test
	public void test() {
		
		Marina m1 = new Marina();
		assertEquals(null, m1.getAddress());
		
		m1.setAddress("address1");
		assertEquals("address1", m1.getAddress());
		
		Marina m2 = new Marina("m2" , "address", 10 /* volume*/ , "location" , 5 /*boat count*/);
		assertEquals("address", m2.getAddress());
	}

}
