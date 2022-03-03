package javapractise;

public class SecondHighest_Number {

	public static void main(String[] args) {
	
		int number[]= {1,2,4,56,7,8,6,89,90,90,110};
		
		int s_hst=0;
		int hst=0;
		
		for(int i=0; i<number.length;i++) {
			
			
			if(number[i]>hst) {
				
				s_hst=hst;
				hst=number[i];
			}
		
			else if(number[i]<s_hst){
				s_hst=number[i];
				
			}
		
		}
		
		
		System.out.println("second highest Number"+ s_hst);
		
		System.out.println("highest Number"+ hst);
		
		

	}

}
