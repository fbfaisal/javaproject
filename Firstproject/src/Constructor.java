

public class Constructor {

	String name;
	int age;
	int weight;
	
	
	public Constructor(String name, int age, int weight)
	{
		
		this.name=name;
		this.age=age;
		this.weight=weight;	
	}
	
public void eat()
{
	System.out.println(this.name+" is eating");

}

public void drink()
{
	System.out.println(this.name+ " is drinking");
}
	
}
