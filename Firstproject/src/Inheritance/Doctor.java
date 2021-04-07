package Inheritance;

import MyPackage4Test.Phone;

public class Doctor extends Human{

	
	private Phone phon=new Phone();
	
	public Phone getPhone() {
		return this.phon;
	}

	
	public Doctor(String name) {
		super(name);
		
	}

	public void howtoloosefat()
	{
	System.out.println("Exersise Exercise Exercise");	
	}

	
}
