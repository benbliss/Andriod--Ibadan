package com.makotojava.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Unit10 {
public int[] intInit() {
	int[] intArray = {
			1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29
			};
	Object Logger l = ((java.util.logging.Logger.getLogger(Unit10.class.getName());
	for (int number : intArray) {
		l.info("Number: " + number);
	}
	return intArray;
}


//UNIT 10 QUIZ Q6
public List<Object> problem6() {
	List<Object> listOfObjects = new ArrayList<>();
	listOfObjects.add(32);
	listOfObjects.add("This is a string");
	listOfObjects.add(Integer.valueOf(238));
	listOfObjects.add(-410);
	listOfObjects.add(null);
	return listOfObjects;
}
}