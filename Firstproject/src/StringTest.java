
public class StringTest {
	
	public static void main(String[] args) {
		
		
		String name= "Selenium web driver";
		String name1="Selenium";
		
		boolean status1=	name.startsWith("Selenium");
		System.out.println("Status1: "+ status1);
		
		boolean status2=	name.endsWith("driver");
		System.out.println("Status2: "+ status2);
		
		
		boolean status3=name.contains("web");
		System.out.println("Status3: "+ status3);
		
		boolean status4=name.contains(name1);
		System.out.println("Status4: "+ status4);
		
		String fullname= "Selenium-qtp-hp-grid";
		String [] toolname=fullname.split("-");
		
		for(int i=0; i<toolname.length;i++) {
			
			System.out.println(toolname[i]);
		}
		
		
		
	}

}
