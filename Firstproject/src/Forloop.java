import java.util.concurrent.ThreadLocalRandom;

public class Forloop {

	public static void main(String[] args) throws InterruptedException {
		
		//for loop
		//thread working to slower the output
		//random number generate
		
		
		
		for(int i=0;i<10;i++)
		
		{
		System.out.println("Hi Everyone");
		Thread.sleep(400);
		
		}
		
		System.out.println("************");
		
		//Random number selection example
	
int j=ThreadLocalRandom.current().nextInt(5);
	

if(j==0) {
	
	System.out.println("Challenge yourself with something you know you could never do, and what you’ll find is that you can overcome anything.");
}
	
if(j==1) {
	
	System.out.println("“What lies behind us and what lies before us are tiny matters compared to what lies within us.” – Henry Stanley Haskins");
}
if(j==2) {
	
	System.out.println("“I think human beings make life beautiful. There’s a lot of beauty in everything. I think what makes life beautiful is the ability to acknowledge that.” – Andrew McMahon");
}
if(j==3) {
	
	System.out.println("“Life is not about having everything. It’s about finding meaning in everything.” – Joel Randymar");
}
if(j==4) {
	
	System.out.println("“Beauty is hidden in everything, just learn how to observe.” – Ritu Ghatourey");
}
if(j==5) {
	
	System.out.println("“When you reach the heart of life you shall find beauty in all things, even in the eyes that are blind to beauty.” – Kahlil Gibran");
}
	

	//Split example

String a= "My Pet Name is Tommy";

String[] arr=a.split(" ");


for(String str : arr) {
	System.out.println(str);
}


}
	}



