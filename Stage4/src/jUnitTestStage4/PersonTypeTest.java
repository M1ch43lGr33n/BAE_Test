package jUnitTestStage4;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.Person;

public class PersonTypeTest {

	@Test
	public void test() {
		Person p1 = new Person();
		assertEquals(null, p1.getCapOrCrew());
		p1.setCapOrCrew("Captain");
		assertEquals("Captain",p1.getCapOrCrew());
		
		Person p2 = new Person("Name", "Surname", "01/01/2000", "Uk", "Crew");
		assertEquals("Crew",p2.getCapOrCrew());
		}
	}
