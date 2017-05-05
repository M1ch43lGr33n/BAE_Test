package jUnitTestStage2;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Marina;

public class MarinaLocationTest {

	@Test
	public void test() {
		Marina m1 = new Marina();
		assertEquals(null, m1.getLocation());
		
		m1.setLocation("Here");
		assertEquals("Here", m1.getLocation());
		
		Marina m2 = new Marina("m2" , "address", 10 /* volume*/ , "There" , 5 /*boat count*/);
		assertEquals("There", m2.getLocation());
	}

}
