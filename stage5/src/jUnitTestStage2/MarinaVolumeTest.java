package jUnitTestStage2;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Marina;

public class MarinaVolumeTest {

	@Test
	public void test() {
		Marina m1 = new Marina();
		assertEquals(0, m1.getVolume());
		
		m1.setVolume(20);
		assertEquals(20, m1.getVolume());
		
		Marina m2 = new Marina("m2" , "address", 10 /* volume*/ , "location" , 5 /*boat count*/);
		assertEquals(10, m2.getVolume());
	}

}
