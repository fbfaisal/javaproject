package Personal;

public class MyHouseTest {

	public static void main(String[] args) {
		
		MyHouse house= new MyHouse("Shakila Monjil","Md.Faisal",7);

		
		house.getName();
		
		//getters
		System.out.println(house.getFloorNum());
		System.out.println(house.getName());
		System.out.println(house.getOwnerName());
		
		//after that we set the attributes
		house.setFloorNum(10);
		house.setName("Ambia Villa");
		house.setOwnerName("dilara");
		
		
		System.out.println(house.getFloorNum());
		System.out.println(house.getName());
		System.out.println(house.getOwnerName());
		
		
	}
	
	

}
