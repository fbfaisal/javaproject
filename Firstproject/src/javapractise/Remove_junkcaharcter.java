package javapractise;

public class Remove_junkcaharcter {

	public static void main(String[] args) {

		
		String s= "i love @%$#^#*# selenium";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		

	}

}
