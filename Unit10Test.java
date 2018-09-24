package com.makotojava.intro;

import java.util.List;

import junit.framework.TestCase;

public class Unit10Test extends TestCase {

	public Unit10Test(String name) {
		super(name);
	}
public void testIntInit(){
	Unit10 testclass = new Unit10();
	
	int[] intArray = testclass.intInit();
	assertEquals(intArray[0], 1);
	assertEquals(intArray[1], 2);
	assertEquals(intArray[2], 3);
	assertEquals(intArray[3], 5);
	assertEquals(intArray[4], 7);
	assertEquals(intArray[5], 11);
	assertEquals(intArray[6], 13);
	assertEquals(intArray[7], 17);
	assertEquals(intArray[8], 19);
	assertEquals(intArray[9], 23);
	assertEquals(intArray[10], 27);
	assertEquals(intArray[11], 29);
}


@Test public void testproblem6(){
	Unit10 testclass = new Unit10();
	List<Object> listOfObjects = testclass.problem6();
	//List<Object> listOfObjects;
	assertEquals(32, listOfObjects.get(0));
	assertEquals("This is a String", listOfObjects.get(1));
	assertEquals(Integer.valueOf(238), listOfObjects.get(2));
	assertEquals(-410, listOfObjects.get(3));
	assertEquals(null, listOfObjects.get(4));
}
}