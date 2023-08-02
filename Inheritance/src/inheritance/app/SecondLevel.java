package inheritance.app;

public class SecondLevel extends Hierarchy{
	String size;
	public void GrassHopper(String size)
	{
		
			System.out.println("Invoke the no-arg in singleLevel");
			this.size=size;
			System.out.println("GrassHopper is "+this.size);
		}

}
