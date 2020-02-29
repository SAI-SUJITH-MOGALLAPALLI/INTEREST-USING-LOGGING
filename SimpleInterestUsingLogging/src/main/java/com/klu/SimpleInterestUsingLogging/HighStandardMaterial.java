package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardMaterial {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(HighStandardMaterial.class);
	public HighStandardMaterial(int areaOfHouse) {
		int finalCost=1800*areaOfHouse;
		LOGGER.error("House Construction cost with high standard materials:"+finalCost);
	}

}
