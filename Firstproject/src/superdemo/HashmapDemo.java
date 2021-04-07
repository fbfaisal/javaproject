package superdemo;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		HashMap<String,String> name= new HashMap<String,String>();

		name.put("100", "fahad");
		name.put("200", "Dilara");
		name.put("300", "Sahran");
		name.put("400", "Saifan");
		
		
		System.out.println(name);
		String value=name.get("100");
		
		System.out.println(value);
		for(Map.Entry<String, String>Data : name.entrySet()) {
			
			System.out.println(Data.getKey()+Data.getValue());
			
		}
		
	}

}
