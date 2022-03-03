package javapractise;

public class Encap_Test {

	public static void main(String[] args) {
		
		
		Encap ec=new Encap();
		
		ec.setEmployee_ID(1111);
		ec.setEmployee_name("fahad");
		
		System.out.println(ec.getEmployee_ID());
		System.out.println(ec.getEmployee_name());
		
		System.out.println(ec.getName());

	}

}
