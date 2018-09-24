package com.makotojava.intro;

import java.util.logging.Logger;
//UNIT 9 QUIZ Q13
public class Unit_9 {
	private static final Logger log = Logger.getLogger(Unit_9.class.getName());
	public void Q13(){
		for (int xx = 0, iterationNumber = 1; xx < 10; xx++, iterationNumber++){
			if(iterationNumber == 4 || iterationNumber == 5 || iterationNumber == 9){
			log.info("Iteration# " + iterationNumber + " ");
			continue;
		}
		log.info("Iteration# " + iterationNumber + ", Loop variable: " + xx);
		}
	}
}