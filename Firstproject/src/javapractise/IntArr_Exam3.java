package javapractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IntArr_Exam3 {

	public static void main(String[] args) {
		
		
		
		int[] arr= {1,3,4,5,6,7,7,8};
		
		HashSet<Integer> hset= new HashSet<>();
		
		for(int a : arr) {
			
			hset.add(a);
		}
		
        System.out.println(hset);	
        
        
        LinkedHashSet<Integer> lhset= new LinkedHashSet<>();
        
        for(int i : arr) {
        	
        	lhset.add(i);
        }
		
		System.out.println(lhset);
		

	}

	
	

}
