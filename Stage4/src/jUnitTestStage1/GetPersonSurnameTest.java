package jUnitTestStage1;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class GetPersonSurnameTest {

	@Test
	public void test() {
		Person p1 = new Person();
		
		assertEquals(null,p1.getSurname());
		
		p1.setSurname("Person surname");
		assertEquals("Person surname", p1.getSurname());
		
		Person p2 = new Person("Name", "Surname", "02/02/2002", "N2", "Crew",false);
		assertEquals("Surname", p2.getSurname());
	}

}
