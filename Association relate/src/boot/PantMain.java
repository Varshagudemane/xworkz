package boot;

import app.Pant;
import app.Zip;

public class PantMain {
	public static void main(String[] args) {
		String style="Cargos";

		Zip zip=new Zip();

		Pant pant=new Pant(style);
		pant.setZip(zip);
		pant.wash();

	}


}
