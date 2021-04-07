
public class IfStatementTest {

	public static void main(String[] args) {
		
		
	boolean ismale=true;
	boolean istall=false;
	
	if(ismale && istall)
	{
		System.out.println("you are a tall male");
	}
	else if(ismale && !istall) {
		
		System.out.println("you are a short male");
	
	}
	System.out.println(max(14,13,14));
	

	}

	public static int max(int a,int b,int c) {
		
		if(a>b && a>c) {
			return a;}
			else if(b>a && b>c){
				return b;
		}
		
			else
			{
				return c;
			}
	}
	
}
