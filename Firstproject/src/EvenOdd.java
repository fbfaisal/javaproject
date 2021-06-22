
public class EvenOdd {

	public static void main(String[] args) {
	
		
		int a[]= {9,12,13,24,6,78,90};
		
		System.out.println("Even number is .......");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd number is .......");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) {
				
				System.out.println(a[i]);
			}
			
		}
			
			

	}

}
