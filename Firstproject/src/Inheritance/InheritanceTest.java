package Inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
	
		
		Teacher teacher=new Teacher("mokbul sir");
		Doctor doctor=new Doctor("faisal");
		Singer singer=new Singer("atif");
		
		teacher.giveusalesson();
		doctor.howtoloosefat();
		singer.singasong();
		doctor.sleep();
		singer.swim();
		teacher.eat();
		doctor.getPhone().settings();
	
	
	}
	
	

}
