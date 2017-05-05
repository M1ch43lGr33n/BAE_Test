package jUnitTestStage3;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;

public class BoatCountryTest {

	@Test
	public void test() {
		Boat b1 = new Boat();
		assertEquals(null, b1.getCountry());
		b1.setCountry("C1");
		assertEquals("C1", b1.getCountry());
		
		Boat b2 = new Boat("Name", "Country", 10 /*size*/, 1 /*speed*/);
		assertEquals("Country", b2.getCountry());
	}

}
