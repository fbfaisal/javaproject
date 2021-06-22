package javapractise;

import java.util.Arrays;
import java.util.List;

public class ArrayPractise {

	public static void main(String[] args) {

		String[] arr= {"fahad","shanto","faisal"};
		
		List list=Arrays.asList(arr);
		
		System.out.println(list);
	
		//String Examples
		String s=new String("ffff");
		s.concat("fff");
		
		System.out.println(s);
		
		StringBuffer sb= new StringBuffer("fahad");
		
		sb.append("faisal");
		System.out.println(sb);
		System.out.println(sb.reverse());

		
		
		
		
	}

}
