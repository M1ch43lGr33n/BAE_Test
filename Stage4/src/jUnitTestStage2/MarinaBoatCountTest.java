package jUnitTestStage2;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Marina;

public class MarinaBoatCountTest {

	@Test
	public void test() {
		Marina m1 = new Marina();
		assertEquals(0, m1.getBoatCount());
		
		m1.setBoatCount(2);
		assertEquals(2, m1.getBoatCount());
		
		Marina m2 = new Marina("m2" , "address", 10 /* volume*/ , "location" , 5 /*boat count*/);
		assertEquals(5, m2.getBoatCount());
	}

}
