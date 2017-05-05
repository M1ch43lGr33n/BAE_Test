package jUnitTestStage3;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;

public class BoatSizeTest {

	@Test
	public void test() {
		Boat b1 = new Boat();
		assertEquals(0, b1.getSize());
		b1.setSize(1);
		assertEquals(1, b1.getSize());
		
		Boat b2 = new Boat("Name", "Country", 2 /*size*/, 1 /*speed*/);
		assertEquals(2, b2.getSize());
	}

}
