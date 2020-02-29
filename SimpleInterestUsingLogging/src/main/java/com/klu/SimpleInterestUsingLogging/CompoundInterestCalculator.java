package com.klu.SimpleInterestUsingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterestCalculator {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(CompoundInterestCalculator.class);
	public CompoundInterestCalculator(int initialPrincipalAmount, double annualInterestRate, int time,
			int numberOfPeriodsElapsed) {
		double finalAmount=(double)initialPrincipalAmount*(1+(annualInterestRate/(double)numberOfPeriodsElapsed))*(numberOfPeriodsElapsed*time);
		LOGGER.error("Compound Interest:"+finalAmount);
	}

}
