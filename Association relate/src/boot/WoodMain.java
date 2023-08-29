package boot;

import app.Paper;
import app.Wood;

public class WoodMain {
	public static void main(String[] args) {

		String type="Color Paper";
		 Wood wood=new Wood();

		 Paper paper=new Paper(type);
		 paper.setWood(wood);
		 paper.write();

	}

}
