package javapractise;

public class Highest_lowest_num {
	
	public static void main(String[] args) {
		
		
		
		int a[]= {23,45,-1,89,67,90,77};
		
		
		int highest_num=a[0];
		int lowest_num=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>highest_num) {
				
				highest_num=a[i];
				
			}
			
			else if(a[i]<lowest_num) {
				
				lowest_num=a[i];
			}
			
		}
		
	
	
		System.out.println("highest number--"+highest_num);
		System.out.println("lowest number--"+lowest_num);
		
		
	}

}
