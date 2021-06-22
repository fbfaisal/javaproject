package javapractise;

public class Reverse_integer {

	public static void main(String[] args) {
		
		int number=12345;
		
		int reverse=0;
		
		
		while(number!=0) {
			
			
			reverse=reverse*10+number%10; //5 500+
			
			number=number/10;//1234.5
			
		}
		
		System.out.println(reverse);
		
		
		
		
	}

}
