package javapractise;

import java.util.Scanner;

public class Prime_number {

	
	public static boolean primenumber(int num) {
		
	if(num<=1) {
		
		return false;
	}
		
	for(int i=2; i<num;i++) {
		
		if(num%i==0) {
			
			return false;
		}
	}

	return true;
	}
	
	
	public static void main(String[] args) {
	
	
	System.out.println("Please Enter your Test Number ");	
	Scanner scan= new Scanner(System.in);
	
	int num=scan.nextInt();
		
	
	System.out.println(primenumber(num));
	}

}
	

