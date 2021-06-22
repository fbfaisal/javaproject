package javapractise;

public class Highest_Num {

	public static void main(String[] args) {

		int num[]= {-1,2,3,4,5,6,7};
		
		
		int hnum=0;
		int lnum=0;
		
		for(int i=0;i<num.length;i++) {
			
			
			if(num[i]>hnum) {
				
				hnum=num[i];
			}
			
			else if(num[i]<lnum){
				
			lnum=num[i];	
				
			}
			
			
		}
		

		System.out.println("Highest Number===>"+hnum);
		
		System.out.println("lowest Number===>"+lnum);
		
	}

}
