//WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
package HashMapAssignments;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assign_05 
{
	Map<Integer, String> map;

	public void addElement()
	{
		map = new HashMap<>();
		map.put(11, "Honda");
		map.put(12, "Hero");
		map.put(13, "TVS");
		map.put(14, "Honda");
		System.out.println("Generic HashMap " + map);
		
		System.out.println(map.get(12));
		System.out.println(map.get(14));
		
		System.out.println("Iterate through Iterator ");
		Set<Integer> o=map.keySet();
		Iterator <Integer>itr = o.iterator();
		while(itr.hasNext())
		{
			Integer temp=itr.next();
			System.out.print(temp+"="+map.get(temp)+" ");
		}
		
		System.out.println("\nIterate through Enumeration ");
		Enumeration<Integer> em= Collections.enumeration(o);
		while(em.hasMoreElements())
		{
			Integer temp1 = em.nextElement();
			System.out.print(temp1+"="+map.get(temp1)+" ");
		}
	}

	public static void main(String[] args)
	{
		Assign_05 as= new Assign_05();
		as.addElement();
	}

}
