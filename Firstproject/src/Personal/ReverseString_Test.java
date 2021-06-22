package Personal;



public class ReverseString_Test {

	public static void main(String[] args) {

		
		String s="shanto";
		
		char[] chars=s.toCharArray();
		
		int length=chars.length;
		
		for(int i=length-1;i>=0;i--) {
			
			System.out.print(chars[i]);
		}
	
	
		StringBuffer sb=new StringBuffer(s);
		
		System.out.print(sb.reverse());
		
		
	}
	

}
