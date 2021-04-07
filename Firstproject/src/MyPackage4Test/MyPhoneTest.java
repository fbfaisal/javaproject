package MyPackage4Test;

public class MyPhoneTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
	Phone myphone=new Phone();
	Phone iphone=new Phone(true,true,true, "iphone7");
	Phone samsung=new Phone(true,true,true, "samsung S8");
	Phone nokia=new Phone(true,false,false, "Nokia 3310");
	
	
	myphone.showcontacts();
	
	iphone.takingpicture();
	samsung.takingpicture();
	nokia.takingpicture();
	iphone.settings();
	
	}

}
