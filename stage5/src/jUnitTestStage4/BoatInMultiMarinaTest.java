package jUnitTestStage4;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;
import mainCode.Marina;
import mainCode.Person;

public class BoatInMultiMarinaTest {

	@Test
	public void test() {
		//creates a boat with person on board
		Person p1 = new Person();
		Boat b1 = new Boat();
		b1.addMember(p1);

		Marina m1 = new Marina("m1" , "address1", 10 /* volume*/ , "location" , 5 /*boat count*/);
		Marina m2 = new Marina("m2" , "address2", 10 /* volume*/ , "location" , 5 /*boat count*/);
		
		b1.setMarina(m1);
		assertEquals(m1,b1.getMarina());
		
		b1.setMarina(m2);
		assertEquals(m2,b1.getMarina());
	}

}
