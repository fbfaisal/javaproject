package OOP;

import java.util.ArrayList;

public class Phone {

	
	int number=10;
	private String mobile="Tmobile";
	private ArrayList<String> contacts= new ArrayList<>();
	

	
	//Below are methods
	
	public void showcontacts()
	{
		for(int i=0; i<contacts.size();i++) {
			System.out.println(i+"."+ contacts.get(i));
		}
		
	}

	public void addcontacts(String name)
	{
		contacts.add(name);
	}
	
	
	public void sing()
	{
		System.out.println("Lalalalalala........");
		
	}
	
	public void cry()
	{
		
		System.out.println("hm hmh hmhmmhm");
	}
	
	public void say(int num) 
	{
		System.out.println("your number is" + num);
		
	}
	
	public void againnum()
	{
		System.out.println(number);
		
	}
	
	public void showmodel() 
	
	{
		System.out.println(mobile);
	}

	public void groupsms(int[] numbers,String msg)
	
	{
	for(int i=0;i<numbers.length;i++)
	
		
		System.out.println("sending message"+ msg+ "  to "+ numbers[i]);

	}

	public void groupsmsname(String[] name, String msge)
	
	
	{
	for(int i=0;i<name.length;i++)
	System.out.println("Sending message"+ msge+ "  to  "+ name[i] );

	}


}



