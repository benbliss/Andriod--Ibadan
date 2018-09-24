package com.makotojava.intro;

import java.util.logging.Logger;

public class Unit9Q12 {
	//Unit Nine Quiz Q12
	private static final Logger log = Logger.getLogger(Unit9.class.getName());
	public void Q12(){
		int xx = 3;
		int iterationNumber = 1; 
		do  {
			log.info("Iteration# " + iterationNumber + ", Loop Variable: " + xx);
			xx++;
			iterationNumber++;
		} while (iterationNumber <= 6); 
	}
}

