
public class SwitchTest {

	public static void main(String[] args) {


	System.out.println(getdayname(2));

	}

	
	public static String getdayname(int dayno) {
		
		
		String dayname="empty";
		
		switch(dayno) {
		case 0: dayname="sunday";
				break;
		case 1: dayname="monday";
				break;
		
		}
		
		
		
		return dayname;
		
		
		
	}
	
}
