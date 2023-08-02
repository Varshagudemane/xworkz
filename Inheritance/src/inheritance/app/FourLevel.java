package inheritance.app;

public class FourLevel extends Hierarchy {
	String length;
	public void Snake(String length) 
	{

	
		System.out.println("Invoke the no-arg in singleLevel");
		this.length=length;
		System.out.println("Snake is "+this.length);
	}


}
