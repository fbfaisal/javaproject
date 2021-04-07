
public class ReturnValueTest {

	public static void main(String[] args) {
		
		
		
		String Whatiinput=test("fahad");
		System.out.println(Whatiinput);

		boolean answer2=test1(false);
		
		System.out.println(answer2);
		
		int number2=test2(10);
		System.out.println(number2);
		
	}

	
	public static String test(String Name) {
		
		return Name;
		
	}
	
	public static boolean test1(boolean answer) {
		
		return answer;	
	}	
	
	
	public static int test2(int number) {
		
		return number;
		
	}

}

