package javapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hmap_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	HashMap<String, String> unsorted= new HashMap<String, String>();
	
	unsorted.put("Y","12");
	unsorted.put("D", "23");
	
	TreeMap<String, String> sorted= new TreeMap<>(unsorted);
	
	for(Map.Entry<String, String> entry : sorted.entrySet()) {
		
		System.out.println(entry.getKey()+"="+entry.getValue());
		
		
	}
	
	System.out.println(sorted);
	

	}

}
