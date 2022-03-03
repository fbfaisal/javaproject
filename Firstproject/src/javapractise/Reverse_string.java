package javapractise;

public class Reverse_string {
	
	
	public static void main(String[] args) {
		
		
		String s= "fahad";
		
		System.out.println("letter count="+s.length());
		//StringBuffer sb= new StringBuffer(s);
		
		//sb.reverse();
		//System.out.println("String Buffer output="+sb);
		
		
		char[] chars=s.toCharArray();
		
		int length=chars.length;
		String rev="";
		//System.out.println(length);
		
		for(int i=length-1;i>=0;i--) {
			
		System.out.print(chars[i]);
		
		rev=rev+chars[i];
		System.out.println(rev);
		}
		
		
	}

}
