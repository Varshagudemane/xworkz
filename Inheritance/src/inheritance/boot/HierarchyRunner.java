package inheritance.boot;

import inheritance.app.EightLevel;
import inheritance.app.FifthLevel;
import inheritance.app.FirstLevel;
import inheritance.app.FourLevel;
import inheritance.app.Hierarchy;
import inheritance.app.SecondLevel;
import inheritance.app.SevenLevel;
import inheritance.app.SixLevel;
import inheritance.app.ThirdLevel;

public class HierarchyRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in the runner");
		Hierarchy hierarchy0=new Hierarchy();
		hierarchy0.FoodChain("foodchain");
		Hierarchy hierarchy1=new  FirstLevel();
		hierarchy1. Grass("green");
		Hierarchy hierarchy2=new SecondLevel();
		hierarchy2.GrassHopper("small");
		Hierarchy hierarchy3=new ThirdLevel();
		hierarchy3. Frog("water");
		Hierarchy hierarchy4=new FourLevel();
		hierarchy4.Snake("long") ;
		Hierarchy hierarchy5=new FifthLevel();
		hierarchy5.Rabbit("white") ;
		Hierarchy hierarchy6=new SixLevel();
		hierarchy6.Lion("king");
		Hierarchy hierarchy7=new SevenLevel();
		hierarchy7.Eagle("bird");
		Hierarchy hierarchy8=new EightLevel();
		hierarchy8.Vulture ("fly");
	}

}


