package app;

import imple.EngineeringRules;

public class EngEngineeeringRules implements EngineeringRules {

	@Override
	public String wearId() {

		return "YES";
	}

	@Override
	public void attendence() {
		System.out.println("Attence method implementaion in EngEngineeringRules.....");

	}

	@Override
	public double fee() {

		return 25000;
	}
}
