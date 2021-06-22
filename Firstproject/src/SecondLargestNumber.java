
public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int arr[]= {12,16,11,9,98,76};
		
		int largest=0;
		
		int sec_largest=0;
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				
				sec_largest=largest;
				largest=arr[i];
			}else if(arr[i]>sec_largest){
				sec_largest=arr[i];
				
				
			}
			
		}
		
		System.out.println("second highestnumber is "+sec_largest);
	}

}
