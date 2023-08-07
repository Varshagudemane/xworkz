package overloading.boot;

import methodoverload.Elevator;
import methodoverload.Gadget;
import methodoverload.Hotel;
import methodoverload.IronBox;
import methodoverload.Ladder;
import methodoverload.Mouse;
import methodoverload.Plier;
import methodoverload.Specs;
import methodoverload.Stapler;
import methodoverload.Umbrella;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calling Main...........");

		Hotel hotel = new Hotel();
		hotel.management();

		System.out.println("------------------------------------");

		IronBox box=new IronBox();
		box.smoothsCloth(89);

		System.out.println("------------------------------------");

		Specs specs=new Specs();
		specs.protects(3);

		System.out.println("------------------------------------");

		Umbrella umbrella=new Umbrella();
		umbrella.protects("Sun", "WineRed");

		System.out.println("------------------------------------");

		Stapler stapler=new Stapler();
		stapler.steples();

		System.out.println("------------------------------------");

		Ladder ladder=new Ladder();
		ladder.ladderTypes();

		System.out.println("------------------------------------");

		Gadget gadget=new Gadget();
		gadget.run("CAR");

		System.out.println("------------------------------------");

		Plier plier=new Plier();
		plier.cuts();

		System.out.println("------------------------------------");

		Mouse mouse=new Mouse();
		mouse.moves();

		System.out.println("------------------------------------");

		Elevator elevator=new Elevator();
		elevator.movement(10);
	}

}


