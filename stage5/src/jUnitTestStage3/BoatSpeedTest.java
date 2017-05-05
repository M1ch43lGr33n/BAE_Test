package jUnitTestStage3;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;

public class BoatSpeedTest {
				//JUnit to test if get/set speed works, and accelerate/decelerate methods work.
	@Test
	public void test() {
		Boat b1 = new Boat();
		assertEquals(0, b1.getSpeed());
		b1.setSpeed(2);
		assertEquals(2, b1.getSpeed());
		
		Boat b2 = new Boat("Name", "Country", 2 /*size*/, 1 /*speed*/);
		assertEquals(1, b2.getSpeed());
		
		b2.accelerate();
		assertEquals(2, b2.getSpeed());
		
		b2.deccelerate();
		assertEquals(1, b2.getSpeed());
	}

}
