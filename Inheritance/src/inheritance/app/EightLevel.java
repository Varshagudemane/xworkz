package inheritance.app;

public class EightLevel extends Hierarchy {
	String type;
	public void Vulture (String type)
	{
		System.out.println("invoking no args in level");
		this.type=type;
		System.out.println("Vulture is"+ type);
			
		}

}
