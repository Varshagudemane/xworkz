package boot;

import app.LaptopProcessor;
import app.Processor;

public class LaptopProcessorMain {
	public static void main(String[] args) {
		String brand="Lenovo";
		Processor processor=new Processor();

		LaptopProcessor laptopProcessor=new LaptopProcessor(brand);

		laptopProcessor.setProcessor(processor);

		laptopProcessor.proceesorType("Intel5");
		laptopProcessor.generation("4G");
		laptopProcessor.ram(16);
		laptopProcessor.compute();
	}
}
