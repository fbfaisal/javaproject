package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_number {
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {11,3,5,4,5,6,6,7};
		
		HashSet<Integer> set= new HashSet<>();
		
		for(int a : arr) {
			
			set.add(a);
			
		}
		
	System.out.println(set);
		//System.out.println(set);
		
		//how to convert set to list
		//ArrayList<Integer> list=new ArrayList<>(set);
		
		//System.out.println(list);
		
		//print array
		//System.out.println(Arrays.toString(arr));
	}

}
