package javapractise;

public class Reverse_Num_Exam3 {

	public static void main(String[] args) {
		
		
		int num=12345;
		
		while(num>0) {
			
			int rev=num % 10;
			System.out.print(rev);
			num=num/10;
			
		}

	}

}
