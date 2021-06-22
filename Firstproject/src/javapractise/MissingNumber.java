package javapractise;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,5,6};
		
		
		int b=0;
		int c=0;
		for(int i=0; i<a.length;i++) {
			
			b=a[i];
			
			for(int j=1; j<a.length;j++) {
				
				c=a[j];
				
				
				if(c-b>1) {
					
					System.out.println(a[j]-1);
					break;
				}
				
			}
		}

	}

}
