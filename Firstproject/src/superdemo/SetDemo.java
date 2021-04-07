package superdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		
		
		Set<String> name=new HashSet<String>();
		
		
		name.add("Fahad");
		name.add("mufti");
		name.add("rahman");
		name.add("aslam");
		
		System.out.println(name);
		
		ArrayList<String> list=new ArrayList<>(name);
		
		for(String B: list) {
			System.out.println(list);
		}
		
		System.out.println(list.get(2));
		
		
		
	}

}
