
public class Miscellaneous {

	public static void main(String[] args) {


		
		System.out.println("How are you doing \ntoday"); //next line
		System.out.println("How are you doing \"today\""); // any special character input
		String Phrase= "How are you doing today";
		String Phrase1= "Giraffe Academy";
		System.out.println(Phrase.toUpperCase());//convert all string to uppercase
		
		System.out.println(Phrase.contains("u"));
		System.out.println(Phrase.charAt(5));
		System.out.println(Phrase.charAt(4));
		System.out.println(Phrase.charAt(3));	//tells it contains ot not
		System.out.println(Phrase.charAt(2));
		System.out.println(Phrase.charAt(1));
		System.out.println(Phrase.charAt(0));
		
		System.out.println(Phrase.indexOf("r")); //tells us the index number
		System.out.println(Phrase.lastIndexOf("doing"));
		
		System.out.println(Phrase.substring(7));
		System.out.println(Phrase1.substring(8, 11)); //grabbing some words
		
		System.out.println(Phrase1.substring(0, Phrase1.indexOf(" ")));
		
		System.out.println(3.0/4.0);
		
		//maths
		int myinteger=5;
		double mydouble=11.0;
		double myabs=-5.5;
		
		System.out.println("Printing double % integer "+mydouble%myinteger);
		
		System.out.println("Printing double power of "+Math.pow(mydouble, 3));
		System.out.println(Math.pow(myinteger, 2));
		System.out.println(Math.abs(myabs));//absolute value
		
		System.out.println((Math.min(myinteger, 0)));//minimum number
		
		
	
		
		
		
		
	}

}
