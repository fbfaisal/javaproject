package Personal;
import java.util.Scanner;

public class QuizContest {

	
	public static void main(String[] args) {
		
		int cans=0;
		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Welcome to Quiz Contest");
		System.out.println("1.Dhaka is the capital of Bangladesh.");

		
		String Answer= scan.nextLine();
		if(Answer.equals("true"))
		{
			System.out.println("Correct Answer");	
			cans+=1;
		}
		else
		{
			System.out.println("Wrong Answer");
		}
		
		System.out.println("2.fahad is a good programmer");
		Answer=scan.nextLine();
		if(Answer.equals("true"))
		{
			System.out.println("Congrats!! Correct Answer");
			
			cans+=1;
		}
		else
		{
			System.out.println("Wrong Answer");
		}
		
		
		int Totalscore=cans;
		
		System.out.println("Your Total Score is " + cans);
	}
	
	
	


}
