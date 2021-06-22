
public class Test {

	public static void main(String[] args) {
	
		Test t=new Test();
		System.out.println(t);
		
		String s1=new String("spring");
		String s4=s1.concat("Fall");
		System.out.println(s1);
	
		String s2=s1.concat("Winter");
		String s3=s2.concat("Summer");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String d="Fahad";
		System.out.println(d.charAt(4));
		System.out.println(d.length());
		System.out.println(d.indexOf("h"));
		
		
		throw new ArithmeticException("bull dog");
		
		
	
		
		

	}
}

