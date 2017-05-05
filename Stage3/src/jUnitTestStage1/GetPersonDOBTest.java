package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class GetPersonDOBTest {

	@Test
	public void test() {
		Person p1 = new Person();
		
		assertEquals(null,p1.getDob());
		
		p1.setDob("01/01/2000");
		assertEquals("01/01/2000", p1.getDob());
		
		Person p2 = new Person("Name", "Surname", "02/02/2002", "N2");
		assertEquals("02/02/2002", p2.getDob());
	}
}
