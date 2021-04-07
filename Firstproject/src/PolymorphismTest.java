
public class PolymorphismTest {

	public static void main(String[] args) {
	
		
		Human monica=new Human("Monica");
	
		Transport t;
		t=new Bus("BOSS Paribahan");
		
		
	monica.travel(t, "Syedpur");
	
		
		t=new Train("Parabat");
		
		monica.travel(t, "Bogra");
		
	}
	
}

	class Human{
	String name;

	
	public Human(String name) {
		this.name=name;
		
	}
	
	public void travel(Transport transport , String destination) {
			
			System.out.println(this.name + " is traveling to "+destination+" by " +transport.name);
			
		}
	
	
}
	
	class Bus extends Transport{

		public Bus(String name) {
			super(name);
			
		}

		}
		class Train extends Transport{

			public Train(String name) {
				super(name);
				
			}
			
		}
		
		
		class Transport{
		String name;
		
		public Transport(String name) {
			
			this.name=name;
		}
		
		
		}