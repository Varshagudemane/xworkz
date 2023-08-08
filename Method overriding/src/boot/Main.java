package boot;

import app.Amoeba;
import app.BassDrum;
import app.BrainEatAmeoba;
import app.Charcoal;
import app.Coal;
import app.Dinosur;
import app.Drum;
import app.Gate;
import app.MetalBangle;
import app.MetalGate;
import app.Mic;
import app.Onithopods;
import app.PVR;
import app.PoleFlex;
import app.ReservationTicket;
import app.Speaker;

public class Main {
	public static void main(String[] args) {
		Coal coal=new Charcoal();
		coal.burns();//Call Method of sub Class

		System.out.println("----------------------");

		Amoeba amoeba=new BrainEatAmeoba();
		amoeba.movement();

		System.out.println("----------------------");

		MetalBangle bangle=new MetalBangle();
		bangle.polish();

		System.out.println("----------------------");

		Gate gate=new MetalGate();
		gate.close();

		System.out.println("----------------------");

		Dinosur dinosur=new Onithopods();
		dinosur.roar();

		System.out.println("----------------------");

		PoleFlex flex=new PoleFlex();
		flex.display();

		System.out.println("----------------------");

		Drum drum=new BassDrum();
		drum.vibrate();

		System.out.println("----------------------");

		PVR pvr=new PVR();
		pvr.show();

		System.out.println("----------------------");

		ReservationTicket reservationTicket=new ReservationTicket();
		reservationTicket.displayBill();

		System.out.println("----------------------");

		Mic mic=new Speaker();
		mic.sound();

	}

}
