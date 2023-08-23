package boot;

import app.MiltaryMilitaryRules;
import imple.MilitaryRules;

public class MilitaryMain {
	public static void main(String[] args) {
		MilitaryRules militaryRules=new MiltaryMilitaryRules();
		System.out.println("Wear Uniform : "+militaryRules.wearUniform());
		System.out.println("UNIT NUMBER : "+militaryRules.unitNumber());
		System.out.println("Service : "+militaryRules.service());
		}


}
