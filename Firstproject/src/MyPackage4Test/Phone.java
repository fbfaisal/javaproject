package MyPackage4Test;

import java.util.ArrayList;

public class Phone {

	
	private ArrayList<String> contacts= new ArrayList<>();
	
	private String model;
	private boolean gps=false;
	private boolean wifi=false;
	private boolean lte=false;

	
	//methods
	
	public Phone(){
		
	}
	
	
	public Phone(boolean gps,boolean wifi,boolean lte,String model)
	{
	this.gps=gps;
	this.wifi=wifi;
	this.lte=lte;
	this.model=model;
	System.out.println("GPS is "+this.gps+" for "+ this.model);
	System.out.println("wifi is "+this.wifi+" for "+ this.model);
	System.out.println("LTE is "+this.lte+" for "+ this.model);
	}
	
	
	public void takingpicture() {
		
		System.out.println(this.model+" is taking picture using camera ");
		
		
	}
	
	public void settings() {
		System.out.println("Settings for "+this.model);
		System.out.println("Display");
		System.out.println("privacy");
		System.out.println("message");
	}
	public void addcontacts(String name) {
		
		contacts.add(name);
	}
	
	public void showcontacts()
	
	{
		for(int i=0;i<contacts.size();i++) {
			System.out.println(i+ "."+ contacts.get(i));
	
		}
		
	}

	public void deletecontacts(String name) {
		
		contacts.remove(name);
		
		
	}
}
