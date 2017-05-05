package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class GetPersonNameTest {

	@Test
	public void test() {
		Person p1 = new Person();
		
		assertEquals(null,p1.getName());
		
		p1.setName("Person Name");
		assertEquals("Person Name", p1.getName());
		
		Person p2 = new Person("Name", "Surname", "02/02/2002", "N2");
		assertEquals("Name", p2.getName());
	}

}
