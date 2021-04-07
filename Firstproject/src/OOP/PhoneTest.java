package OOP;

public class PhoneTest {

	public static void main(String[] args) {
		
	
		Phone amarphone= new Phone();
		int[] gnum= new int[] {10,11,12,13};
		String[] gname= new String[] {"Shanta","Sahran","Saifan"};
		
		
		
		amarphone.sing();
		amarphone.cry();
		amarphone.say(123456789);
		amarphone.againnum();
		amarphone.showmodel();
		
		//Adding contacts using Array List
		amarphone.addcontacts("Sahran");
		amarphone.addcontacts("saifan");
		amarphone.addcontacts("shanta");
		amarphone.showcontacts();
		
		
		amarphone.groupsms(gnum, "hi everyone");
		amarphone.groupsmsname(gname, "  Hello Guys  ");

	
	
	}
	
	
	
}
