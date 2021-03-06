package LinkedHashMapAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Assign_09 {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(10, "Irfan");
		lmap.put(20, "Ganesh");
		lmap.put(9, "Omkar");
		lmap.put(1, "Vishal");
		lmap.put(40, "Rajesh");
		
		
		Set<Integer>st=lmap.keySet();
		List<Integer>list=new ArrayList<>(st);   // pass set to array list 
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1)+" "+lmap.get(list.get(list.size()-1)));
		System.out.println(list.get(0)+" "+lmap.get(list.get(0)));
		

	}

}
