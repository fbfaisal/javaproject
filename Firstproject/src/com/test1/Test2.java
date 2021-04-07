package com.test1;

public class Test2 {

	public static void main(String[] args) {
		
		String fullname= "Selenium-qtp-hp-grid";
		
		String [] toolname=fullname.split("-");
		
		for(int i=0; i<toolname.length;i++) {
			
			System.out.println(toolname[i]);
			
			if(toolname[i].equalsIgnoreCase("hp")) {
				
				System.out.println("Test Pass");
				break;
				
				
			}
			
		}
		
		
	}

}
