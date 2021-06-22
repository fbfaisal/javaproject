package javapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorted_Map {

	public static void main(String[] args) {

		
		HashMap<String, String> unsorted_map= new HashMap<>();
		
		
		unsorted_map.put("ball", "ball");
		unsorted_map.put("apple", "apple");
		
		for(Map.Entry<String, String> entry : unsorted_map.entrySet()) {
			
			System.out.println(entry.getValue());
			
		}
		
		TreeMap<String,String> treemap=new TreeMap<>(unsorted_map);
		
		for(Map.Entry<String, String> entry:treemap.entrySet()) {
			
			System.out.println(entry.getValue());
		}

		
	}

	
	
}
