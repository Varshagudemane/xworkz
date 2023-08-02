package inheritance.app;

public class SevenLevel extends Hierarchy {
	String type;
	public void Eagle(String type)
	{
		System.out.println("invoking no args in level");
		this.type=type;
		System.out.println("Eagle is"+ type);
			
		}
	}


