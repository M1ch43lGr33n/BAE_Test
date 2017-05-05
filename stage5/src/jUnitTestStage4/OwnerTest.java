package jUnitTestStage4;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class OwnerTest {

	@Test
	public void test() {
		Person p1 = new Person();
		assertEquals(false,p1.getOwner());
		p1.setOwner(true);
		assertEquals(true,p1.getOwner());
		
		Person p2 = new Person("Name", "Surname", "02/02/2002", "N1", "Crew", true);
		assertEquals(true, p2.getOwner());
	}

}
