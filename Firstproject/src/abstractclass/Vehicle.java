package abstractclass;

public abstract class Vehicle {

	
	private String Name;
	
	public Vehicle(String Name) {
		
		this.Name=Name;
		
	}


	public abstract void drive();

	public String getName() {
		
		return this.Name;
	}
}

