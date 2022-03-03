package javapractise;

public class Missing_Number {

	public static void main(String[] args) {

		
		int number[]= {1,2,3,4,6};
		
		int sum=0;
		
		int length=number.length;
		
		for(int i=0; i<length;i++) {
			
			sum=sum+number[i];
			
		}
		
		//System.out.println(sum);
		
		
		int sum1=0;
		
		for(int j=1; j<=6;j++) {
			
			sum1=sum1+j;
		}
		
		//System.out.println(sum1);
		
		System.out.println(sum1-sum);
	}

}
