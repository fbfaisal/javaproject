package javapractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Sorted_Map {

	public static void main(String[] args) {

		
		HashMap<String, String> unsorted_map= new HashMap<>();
		
		
		unsorted_map.put("b", "ball");
		unsorted_map.put("a", "apple");
		
		
		for(Map.Entry<String, String> entry : unsorted_map.entrySet()) {
			
			System.out.println(entry.getValue());
			
		}
		
		
		TreeMap<String,String> treemap=new TreeMap<>(unsorted_map);
		
		//Iterating using EntrySet
		for(Map.Entry<String, String> entry:treemap.entrySet()) {
			
			System.out.println(entry.getValue());
		}

		//Iterating Using key set & Iterator
		
		Iterator<String> it=treemap.keySet().iterator();
		
		while(it.hasNext()) {
			
		String key=	it.next();
		String value=treemap.get(key);
		System.out.println("Key==>"+key+" Value==>"+value);
		
		}
		
	
		
		String[] arr= {"fahad","billu"};
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	
	
}
