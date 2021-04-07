import java.util.Scanner;

public class BasicCalc {

	public static void main(String[] args) {

		
		
		Scanner response=new Scanner(System.in);
		
		System.out.println("Please enter your first number");
	
		try {
		double input1=response.nextInt();
		
		System.out.println("Please enter your Operator");
		String op=response.next();
		
		
		System.out.println("Please enter your second number");
		
		double input2=response.nextInt();
		
		
		if(op.equals("+")) {
			System.out.println("Your Addition Result="+(input1+input2));
			
		}
		
		else if(op.equals("-")) {
			System.out.println("Your Substraction Result="+(input1-input2));
		}
			else {
				System.out.println("invalid operator");
				
				
			}}
		
		catch(Exception e) {
			System.out.println("invalid iput");
		}
	
	}
		
		
		
		
		}
		
		
	

