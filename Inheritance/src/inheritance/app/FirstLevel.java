package inheritance.app;

public class FirstLevel extends Hierarchy{
	String color;
	public void Grass(String color)
	{
System.out.println("Invoke the no-arg in singleLevel");
this.color=color;
System.out.println("Grass is "+this.color);
	}
}


