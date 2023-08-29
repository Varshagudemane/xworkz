package boot;

import app.Laptop;
import app.Trainer;

public class TrainerMain {
	public static void main(String[] args) {
		String trainerName = "Omkar";

		Laptop laptop = new Laptop();

		Trainer trainer = new Trainer(trainerName);
		trainer.setLaptop(laptop);
		trainer.teach();

	}



}
