
public class ArrayTest2d {

	public static void main(String[] args) {


		
	int [][] mynumber= {{1, 2, 3,11,12,13},
						{4, 5, 6},
						{7, 8, 9}};
			
			
	for(int i=0; i<mynumber.length;i++) {
		
		for(int j=0; j<mynumber[i].length;j++) {
			
			
			System.out.print(mynumber[i][j]);
		}
		
		System.out.println();
	}
	
	
	}

}
