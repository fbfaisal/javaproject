package javapractise;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("1");
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("2");
		
		ArrayList<String> list= new ArrayList<String>();
		list.addAll(list2);
		list.addAll(list1);
		System.out.println(list);
	}

}
