package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class SimpleInterestCalculator {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(SimpleInterestCalculator.class);
	public SimpleInterestCalculator(int initialPrincipalAmount, double annualInterestRate, int time) {
		double finalAmount=(double)initialPrincipalAmount*(1+(annualInterestRate*(double)time));
		LOGGER.error("Simple Interest:"+finalAmount);
	}

}
