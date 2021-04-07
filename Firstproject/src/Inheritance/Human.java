package Inheritance;

public class Human {

	private String name;
	
	public Human(String name)
	{
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}

	public void eat()
	{
		System.out.println(this.name+" is eaitng");
	}

	public void sleep()
	{
		System.out.println(this.name+" is slepping");
	}
	
	public void swim()
	{
		System.out.println(this.name+" is swimming");
	}
}


