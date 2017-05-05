package jUnitTestStage4;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;
import mainCode.Marina;
import mainCode.Person;

public class BoatEnterMarina {

	@Test
	public void test() {
		Boat b1 = new Boat();
		Person p1 = new Person();
		b1.addMember(p1); //adds person to boat so it can go in to marina
		
		Marina m1 = new Marina("m2" , "address", 10 /* volume*/ , "location" , 2 /*boat count*/); //only allows 2 boats
		m1.addBoat(b1);
		assertEquals(1,m1.getBoatListSize());	// checks we can have 1 boat in 1 marina
		
		Boat b2 = new Boat();
		Person p2 = new Person();
		b2.addMember(p2); //adds person to boat so it can go in to marina

		m1.addBoat(b2);
		assertEquals(2,m1.getBoatListSize());	// checks we can have multiple boats in 1 marina
		
		Boat b3 = new Boat();
		Person p3 = new Person();
		b3.addMember(p3); //adds person to boat so it can go in to marina
		m1.addBoat(b3);
		
		assertEquals(2,m1.getBoatListSize());	// checks we can't have more than total number of boats in marina
	}

}
