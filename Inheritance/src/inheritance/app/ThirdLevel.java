package inheritance.app;

public class ThirdLevel extends Hierarchy {
	String live;
	public void Frog(String live)
	{
		
			System.out.println("Invoke the no-arg in singleLevel");
			this.live=live;
			System.out.println("Frog is "+this.live);
		}

}
