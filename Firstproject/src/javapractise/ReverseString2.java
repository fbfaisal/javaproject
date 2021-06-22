package javapractise;

public class ReverseString2 {

	public static void main(String[] args) {
	
		
		String s="fahad";
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		char[] rev=s.toCharArray();
		for(int i=rev.length-1;i>=0;i--) {
			System.out.println(rev[i]);
			
		}
		
		StringBuilder sb2= new StringBuilder(s);
		
		System.out.println(sb2.reverse());

	}

}
