package javapractise;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Duplicate_Num {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7,8,2};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
			
		}
		

		String character[]= {"fahad","fahad","hssd","djejeke"};
		
		for(int k=0;k<character.length;k++) {
			
			for(int l=k+1;l<character.length;l++) {
				
				if(character[k]==character[l]) {
					
					System.out.println(character[k]);
				}
			}
		}
		
		
		int num[]= {1,2,3,45,55,45,6,3};
		
		
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,45,55,45,6,3));
		
		LinkedHashSet<Integer> lhset=new LinkedHashSet<Integer>(arr); 
		
		System.out.println(lhset);
		
		
		
	}

	
	
	
}
