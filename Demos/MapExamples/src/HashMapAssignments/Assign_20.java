//20. WAP to iterate the elements in the Map stored in the above Map.
package HashMapAssignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assign_20
{
	Map<Integer, String> map;
	Map<Integer, Map> map1;
	
	public void creatMAp() 
	{
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		
		map1=new HashMap<>();
		map1.put(23, map);
		
		System.out.println(map1);
		
	}
	public void iterateMap()
	{
		Set<Integer>st=map1.keySet();
		Iterator <Integer>itr= st.iterator();
		Collection sc=map1.values();
		while(itr.hasNext())
		{
			Integer temp=itr.next();
			System.out.println(temp+" "+map1.get(temp));
					
		}
		
	}
	public static void main(String[] args)
	{
		Assign_20 as= new Assign_20();
		as.creatMAp();
		as.iterateMap();
	}

}
