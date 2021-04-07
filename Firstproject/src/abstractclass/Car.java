package abstractclass;

public class Car extends Vehicle {

	public Car(String Name) {
		super(Name);
	
	}

	@Override
	public void drive() {
		System.out.println("Vehicle "+ this.getName()+" is on the move");
		
		
	}

}
