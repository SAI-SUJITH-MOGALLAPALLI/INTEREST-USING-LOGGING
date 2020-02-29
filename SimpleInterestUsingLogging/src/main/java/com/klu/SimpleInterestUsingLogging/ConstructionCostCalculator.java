package com.klu.SimpleInterestUsingLogging;

public class ConstructionCostCalculator {
	ConstructionCostCalculator(){
		int areaOfHouse=100;
		new StandardMaterial(areaOfHouse);
		new AboveStandardMaterial(areaOfHouse);
		new HighStandardMaterial(areaOfHouse);
		new HighStandardAndFullyAutomated(areaOfHouse);
	}
}
