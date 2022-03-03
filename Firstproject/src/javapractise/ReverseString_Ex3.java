package javapractise;

import java.util.Scanner;

public class ReverseString_Ex3 {

	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		
		
		//String str= "MOM";
		String rev="";
		
	//	char[] chars=str.toCharArray();
		
		for(int i= str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
			System.out.println(rev);
			
		}
	
	if(str.equalsIgnoreCase(rev)) {
		
		System.out.println("This is paliindrome");
	}
	
	else 
		
		System.out.println("this is not palindrome");
	
	}
	
}
