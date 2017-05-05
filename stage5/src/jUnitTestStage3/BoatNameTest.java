package jUnitTestStage3;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;

public class BoatNameTest {

	@Test
	public void test() {
		Boat b1 = new Boat();
		assertEquals(null, b1.getName());
		b1.setName("This");
		assertEquals("This", b1.getName());
		
		Boat b2 = new Boat("That", "Country", 10 /*size*/, 1 /*speed*/);
		assertEquals("That", b2.getName());
	}

}
