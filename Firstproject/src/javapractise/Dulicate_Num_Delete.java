package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;



public class Dulicate_Num_Delete {

	public static void main(String[] args) {
	

		
	ArrayList<Integer> numbers=new ArrayList(Arrays.asList(12,13,14,14));
	
	LinkedHashSet<Integer> linkedhashset= new LinkedHashSet(numbers);
	
	ArrayList<Integer> result=new ArrayList(linkedhashset);
	
	System.out.println(linkedhashset);

	System.out.println(result);
	
	//second method
	
	ArrayList<Integer> number=new ArrayList(Arrays.asList(1,2,4,5,5,5,6,7,8,9,0));
	
	List<Integer> final_Number=number.stream().distinct().collect(Collectors.toList());
	
	System.out.println(final_Number);
	}

}
