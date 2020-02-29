package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StandardMaterial {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(StandardMaterial.class);
	public StandardMaterial(int areaOfHouse) {
		int finalCost=1200*areaOfHouse;
		LOGGER.error("House Construction cost with standard materials:"+finalCost);
	}

}
