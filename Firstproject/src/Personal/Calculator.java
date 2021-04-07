package Personal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Welcome to Calculator");
		System.out.println("please input your number");
		
		int a=scan.nextInt();
		System.out.println("please input your second number");
		int b=scan.nextInt();
		
		System.out.println("Your Result is "+(a+b));

	}

}
