package jUnitTestStage4;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Boat;
import mainCode.Person;

public class BoatCrewtTest {

	@Test
	public void test() {
		
		Boat b1 = new Boat("Name" , "ThatCountry" ,10 , 1);
		Person p1 = new Person("person" ,"one",	"01/01/2000", "N1", "Crew", false /*is owner*/);
		Person p2 = new Person("person" ,"two",	"02/01/2000", "N1", "Captain", true);
		
		b1.addMember(p1);
		b1.addMember(p2);
		
		assertEquals(2, b1.getMemberCount());	//check that 1 boat can have multiple members of its crew
		
		Person p3 = new Person("person" ,"three", "03/01/2000", "N1", "Crew", true);
		b1.addMember(p3);
		
		assertEquals(3, b1.getMemberCount());	//test to check it can have 2 owners
		
		Person p4 = new Person("person" ,"four", "04/01/2000", "N1", "Captain", false);
		b1.addMember(p4);
			
		assertEquals(3, b1.getMemberCount());	//should only show 3 members per boat as it can't have 2 captains - only p1 can be captain		
	//currently works fine
		
	}

}
