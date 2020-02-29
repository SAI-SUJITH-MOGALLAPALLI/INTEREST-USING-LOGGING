package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardAndFullyAutomated {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(HighStandardAndFullyAutomated.class);
	public HighStandardAndFullyAutomated(int areaOfHouse) {
		int finalCost=1200*areaOfHouse;
		LOGGER.error("House Construction cost with high standard materials and Fully Automated:"+finalCost);
	}
	
}
