
public class CarTest {

	public static void main(String[] args) {
		
		
		Car mycar=new Car();
		
		
		System.out.println(mycar.getModel());
		System.out.println(mycar.getColor());
		System.out.println(mycar.getDoor());
		System.out.println(mycar.isAWD());
	System.out.println("*************************");

		
		mycar.setModel("Audi Q7");
		mycar.setColor("White");
		mycar.setDoor(4);
		mycar.setAWD(false);
		
		System.out.println(mycar.getModel());
		System.out.println(mycar.getColor());
		System.out.println(mycar.getDoor());
		System.out.println(mycar.isAWD());
		
		
	}
	
	

}
