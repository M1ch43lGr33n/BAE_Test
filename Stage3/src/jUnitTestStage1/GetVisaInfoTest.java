package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class GetVisaInfoTest {

	@Test
	public void test() {

		Person p1 = new Person("Name", "Surname", "02/02/2002", "Uk");
		p1.setVisaInfo(p1.getNationality());
		
		assertEquals("Uk National", p1.getVisaInfo());
		
		p1.setNationality("France");
		p1.setVisaInfo(p1.getNationality());
		assertEquals("France", p1.getNationality());
		assertEquals("VisaInfo", p1.getVisaInfo());
	}

}
