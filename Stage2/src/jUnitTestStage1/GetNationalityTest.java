package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class GetNationalityTest {

	@Test
	public void test() {
		Person p1 = new Person();
		
		assertEquals(null,p1.getNationality());
		
		p1.setNationality("N1");
		assertEquals("N1", p1.getNationality());
		
		Person p2 = new Person("Name", "Surname", "02/02/2002", "N2");
		assertEquals("N2", p2.getNationality());
	}

}
