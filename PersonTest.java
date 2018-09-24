package com.makotojava.intro;

import java.util.logging.Logger;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public PersonTest(String name) {
		super(name);
	}
		@Test
		public void testPerson() {
		Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		//Logger l = Logger.getLogger(Person.class.getName());
		String fullName =  p.getfullName();
		/*l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight());
		l.info("Eye Color:" + p.getEyeColor());
		l.info("Gender:" + p.getGender()); */
		assertEquals("Joe Q Author", fullName);
		/* assertEquals(42, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(82, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender()); */
		}
	}

	private void assertEquals(String string, String fullName) {
		// TODO Auto-generated method stub
		
	}

	
	//UNIT SIX QUIZ Q5
		@Test
		public void testToString(){
			Person p = new Person("Joshua Ade", 34, 165, 90, "Yellow", "Male");
			
			Logger l = Logger.getLogger(Person.class.getName());
			
			1.info("toString(): " + p.toString());
		}
		private void info(String string) {
			// TODO Auto-generated method stub
			
		}
