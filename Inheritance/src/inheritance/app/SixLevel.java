package inheritance.app;

public class SixLevel extends Hierarchy {
	String name;
	
	public void Lion(String name) {
		System.out.println("Invoke the no-arg in singleLevel");
		this.name=name;
		System.out.println("Lion is "+this.name);
	}
}


