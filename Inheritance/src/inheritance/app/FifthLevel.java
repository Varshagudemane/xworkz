package inheritance.app;

public class FifthLevel extends Hierarchy{
	String color;
	public void Rabbit(String color) 
	{

		System.out.println("Invoke the no-arg in singleLevel");
		this.color=color;
		System.out.println("Rabbit is "+this.color);
	}

}
