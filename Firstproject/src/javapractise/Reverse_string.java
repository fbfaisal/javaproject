package javapractise;

public class Reverse_string {
	
	
	public static void main(String[] args) {
		
		
		String s= "fahad";
		
		
		char[] chars=s.toCharArray();
		
		int length=chars.length;
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--) {
			
		System.out.println(chars[i]);
		}
		
		
	}

}
