package casting.app.util;

import casting.app.MobileShowroom;
import casting.app.Showroom;
import casting.app.WatchShowroom;

public class ShowroomUtil {
	public void showroomUtil(Showroom showroom) {
		Showroom showroom2 = new Showroom();
		showroom2.showroomTime();

		if (showroom instanceof WatchShowroom) {
			Showroom showroom3 = new WatchShowroom();
			showroom3.showroomTime();

			WatchShowroom watchShowroom = (WatchShowroom) showroom3;
			watchShowroom.watchName();
		}

		if (showroom instanceof MobileShowroom) {
			Showroom showroom4 = new MobileShowroom();
			showroom4.showroomTime();

			MobileShowroom mobileShowroom = (MobileShowroom) showroom4;
			mobileShowroom.mobilePrice();
		}

	}

}
