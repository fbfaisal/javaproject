package Inheritance;

public class Singer extends Human{

	
	
	public Singer(String name) {
		super(name);
		
	}
	
	//this is called overriding
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(" sorry i dont know how to swim");;
	}


	public void singasong() 
	{
		System.out.println("Amar Sonar bangla Ami tomae BHalobashi");
	}
}
