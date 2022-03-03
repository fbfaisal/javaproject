package javapractise;

import com.google.common.primitives.Chars;

public class Letter_count {

	public static void main(String[] args) {
	
		String str="i love bangladesh";
		
		String str1=str.replaceAll("a", "@");
		
		
		String s="java is a programming language";
		
		System.out.println(s.replaceAll(" ", ""));
		
		
		char[] chars=s.toCharArray();
		
		String s2="";
		
		for(int i=0; i<chars.length;i++) {
			
			
			if(chars[i]!=' ') {
				
				s2=s2+chars[i];
			}
			
			
		}
		System.out.println(s2);
		System.out.println(s2.length());
	}

}
