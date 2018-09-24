package com.makotojava.intro;

import java.util.logging.Logger;

public class Unit9Q11 {
	//Unit Nine Quiz Q11
		private static final Logger log = Logger.getLogger(Unit9Q11.class.getName());
	public void Q11(){
		int xx = 3; 
		int iterationNumber = 1; 
		while (iterationNumber <= 6)  {
			log.info("Iteration# " + iterationNumber + ", Loop Variable: " + xx);
			xx++;
			iterationNumber++;
		}
	}
	}
