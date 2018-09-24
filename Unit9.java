package com.makotojava.intro;

import java.util.logging.Logger;

//Unit Nine Quiz Q10
public class Unit9 {
private static final Logger log = Logger.getLogger(Unit9.class.getName());
public void Q10(){
	for (int xx = 3, iterationNumber = 1; iterationNumber <= 6; xx++, iterationNumber++){
		log.info("Iteration# " + iterationNumber + ", Loop Variable: " + xx);
	}
}
}

