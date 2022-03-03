package javapractise;

public class HighestNum_exam3 {

	public static void main(String[] args) {
	
		
		int[] arr= {1,2,5,6,7,88,90};
		
		int h_num=0;
		
		int sh_num=0;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>h_num) {
				
				sh_num=h_num;
				h_num=arr[i];
				
			}
			else if(arr[i]<sh_num) {
				
				sh_num=arr[i];
			}
		
		}
		
		System.out.println("highest number"+h_num);
		System.out.println("Second highest number"+sh_num);
		

	}

}
