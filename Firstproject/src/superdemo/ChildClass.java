package superdemo;

public class ChildClass extends ParentClass {
	
	int interest_rate= 9;
	public static void main(String[] args) {
	
	
		ChildClass obj= new ChildClass();
		
		obj.showintrate();
		
		obj.fun();
		
	
	}
	public void showintrate() {
		

		System.out.println("int rate from child " + super.interest_rate);
		
	}

	public void fun() {
		
	super.showintrate();
	System.out.println("i m from fun");
	}
	
	

}