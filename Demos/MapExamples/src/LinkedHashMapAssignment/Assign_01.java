package LinkedHashMapAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
//1. WAP to create a LinkedHashMap which contains Integers as key and Strings as value. Print
import java.util.Set;

public class Assign_01 
{
	public static void main(String...a)
	{
	LinkedHashMap<Integer, String> lmap=new LinkedHashMap<>();
	lmap.put(10, "Irfan");
	lmap.put(20, "Ganesh");
	lmap.put(9, "Omkar");
	lmap.put(1, "Vishal");
	lmap.put(40, "Rajesh");
		
	Set<Integer> st= lmap.keySet();
	Iterator<Integer>itr=st.iterator();
	while(itr.hasNext())
	{
		Integer temp=itr.next();
		System.out.println(temp+" "+lmap.get(temp));
	}
	}	
}
