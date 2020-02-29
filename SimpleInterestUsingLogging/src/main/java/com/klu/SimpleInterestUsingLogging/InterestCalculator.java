package com.klu.SimpleInterestUsingLogging;

public class InterestCalculator {
	InterestCalculator(){
		int initialPrincipalAmount=10000;
		double annualInterestRate=0.14;
		int time=2;
		int numberOfPeriodsElapsed=4;
		new SimpleInterestCalculator(initialPrincipalAmount,annualInterestRate,time);
		new CompoundInterestCalculator(initialPrincipalAmount,annualInterestRate,time,numberOfPeriodsElapsed);
	}
}
