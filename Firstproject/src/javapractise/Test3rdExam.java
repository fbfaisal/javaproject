package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test3rdExam {

	public static void main(String[] args) {
	
		
		int[] num= {1,3,5,5,6,8,0,-1};
		
		
		int h_num=0;
		int sh_num=0;
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>h_num) {
			
			sh_num=h_num;	
			h_num=num[i];
				
			}
			
			else if(num[i]>sh_num) {
				
				sh_num=num[i];
			}
			
		}
		
	System.out.println("highest Number="+ h_num);	
	System.out.println("Second highest Number="+ sh_num);
	
	

	
	
	
}
}
