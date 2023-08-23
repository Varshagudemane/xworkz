package boot;

import app.EngEngineeeringRules;
import imple.EngineeringRules;

public class EngineeringMain {
	public static void main(String[] args) {
		EngineeringRules engineeringRules=new EngEngineeeringRules();
		System.out.println("Wear Id : "+engineeringRules.wearId());
		engineeringRules.attendence();
		System.out.println("FEE : "+engineeringRules.fee());

	}



}
