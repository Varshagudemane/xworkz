class Wood{
	String woodName;
	double price;
	String type;
	String color;
	float weight;
	
	Wood(){
		super();
		System.out.println("Invoking no-arg constructor of Wood");
	}
	Wood(String woodName){
		this();
		this.woodName=woodName;
		System.out.println("Invoking string constructor of Wood");	
	}
	Wood(String woodName,double price){
		this(woodName);
		this.price=price;
		System.out.println("Invoking string,double constructor of Wood");
	}
	Wood(String woodName,double price,String type){
		this(woodName,price);
		this.type=type;
		System.out.println("Invoking string,double,String constructor of Wood");
	}
	Wood(String woodName,double price,String type,String color){
		this(woodName,price,type);
		this.color=color;
		System.out.println("Invoking string,double,String,string constructor of Wood");
	}
	Wood(String woodName,double price,String type,String color,float weight){
		this(woodName,price,type,color);
		this.weight=weight;
		System.out.println("Invoking string,double,String,string,float constructor of Wood");
	}
	
	
}