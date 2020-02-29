package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AboveStandardMaterial {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(AboveStandardMaterial.class);
	public AboveStandardMaterial(int areaOfHouse) {
		int finalCost=1500*areaOfHouse;
		LOGGER.error("House Construction cost with above standard materials:"+finalCost);
	}

}
