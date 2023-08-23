package app;

import imple.MilitaryRules;

public class MiltaryMilitaryRules implements MilitaryRules {

	@Override
	public boolean wearUniform() {
		return true;
	}

	@Override
	public String service() {
		return "Security";
	}

	@Override
	public int unitNumber() {
		return 100;
	}

}


