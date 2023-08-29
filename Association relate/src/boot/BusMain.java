package boot;

import app.Bus;
import app.Passenger;

public class BusMain {
	public static void main(String[] args) {
		String type = "KSRTC";

		Passenger passenger = new Passenger();

		Bus bus = new Bus(type);
		bus.setPassenger(passenger);
		bus.drive();
	}

}
