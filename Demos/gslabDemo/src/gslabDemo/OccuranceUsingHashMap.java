package gslabDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OccuranceUsingHashMap 
{
	Map<Integer, String> map,map1;

	public void creatMAp()
	{
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		map.put(null, "BMW");
		System.out.println("HashMap map " + map);

				
		Set<Integer>st= map.keySet();
		Iterator<Integer>itr= st.iterator();
		while(itr.hasNext())
		{
			Integer temp=itr.next();
			int count=Collections.frequency(st, temp);
			System.out.println(map.get(temp) +"  count "+count);
		}
	}
	public static void main(String arrg[])
	{
		OccuranceUsingHashMap  o= new OccuranceUsingHashMap ();
		o.creatMAp();
	}

}
