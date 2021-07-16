package LinkedHashMapAssignment;

import java.util.Iterator;
import java.util.LinkedHashMap;
//2. WAP to create a LinkedHashMap which contains Strings as key and Integers as value. 
//Print the map contents and observe the order. Don�t use generics.
import java.util.Set;

public class Assign_03 
{
	public static void main(String...a)
	{
	LinkedHashMap lmap=new LinkedHashMap();
	lmap.put("Irfan",2019);
	lmap.put("Ganesh",21);
	lmap.put("Omkar",34);
	lmap.put("Vishal",56);
	lmap.put("Rajesh",100);
		
	Set<String> st= lmap.keySet();
	Iterator<String>itr=st.iterator();
	while(itr.hasNext())
	{
		String temp=itr.next();
		System.out.println(temp+" "+lmap.get(temp));
	}
}

}
