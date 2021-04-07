import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args)
	{
	
		ArrayList<String> name= new ArrayList<>();
		
		
		name.add("sahran");
		name.add("saifan");
		name.add("sifat");
		name.add("shafi");
		name.add("ayaan");
		
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		System.out.println(name.get(2));
		System.out.println(name.get(3));
		System.out.println(name.get(4));
		System.out.println("***********");
		
		//for loop works
		
		for(int i=0; i<name.size();i++)
		{
			
			System.out.println(name.get(i));
			
		}
		System.out.println("***********");
		
		
		// WE CAN ADD MORE NAME
		
		name.add("Shafiul");
		for(int i=0; i<name.size();i++)
		{
			
			System.out.println(name.get(i));
			
		}
		System.out.println("***********");
		
		
		//WE CAN DELETE NAME AS WELL
		
		
		name.remove("Shafiul");
		
		for(int i=0; i<name.size();i++)
		{
			
			System.out.println(name.get(i));
			
		}
		System.out.println("***********");
		
		//Simplified for loop
		
		for(String s : name)
		{
			System.out.println(s);
		}
		
		
	}
}
