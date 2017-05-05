package jUnitTestStage2;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Marina;

public class MarinaNameTest {

	@Test
	public void test() {
		Marina m1 = new Marina();
		assertEquals(null, m1.getMarinaName());
		
		m1.setMarinaName("m1.1");
		assertEquals("m1.1", m1.getMarinaName());
		
		Marina m2 = new Marina("m2" , "address", 10 /* volume*/ , "location" , 5 /*boat count*/);
		assertEquals("m2", m2.getMarinaName());
	}

}
