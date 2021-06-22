
public class MaximumNumber {

	public static void main(String[] args) {
	
		
		int a[]= {10,20,30,1,3,5,70,99};
		
		int max=a[0];
		
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
			max=a[i];	
		}
		}
		
		System.out.println(max);

	}

}
