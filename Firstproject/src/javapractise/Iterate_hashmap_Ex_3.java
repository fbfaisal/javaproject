package javapractise;

import java.util.HashMap;
import java.util.Iterator;



public class Iterate_hashmap_Ex_3 {

	public static void main(String[] args) {
		
		//Iterate Hashmap-1
		HashMap<String, String> map= new HashMap<>();
		
		map.put("Dhaka", "Bangladesh");
		map.put("Delhi", "India");
		
		Iterator<String> it=map.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key=it.next();
			String value=map.get(key);
			//System.out.println("key="+key+"Value="+value);
		}
			
		//Iterate Hashmap-2
			
			
	HashMap<Object, Object> map1= new HashMap<>();
		
		map1.put("1", "Bangladesh");
		map1.put("2", "India");
		
		Iterator<Object> it1=map1.keySet().iterator();
		
		while(it1.hasNext()) {
			
			Object key1=it1.next();
			
			Object value1=map1.get(key1);
			
			System.out.println("key--"+key1+" Value--"+value1);
		}
		
			
			
		}

	}


