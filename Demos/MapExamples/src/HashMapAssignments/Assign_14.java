//14. WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
package HashMapAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assign_14 
{
	Map<Integer, String> map,map1;

	public void creatMAp() 
	{
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(84, "Honda");
		map.put(null, "BMW");
		map.put(1, null);
		System.out.println("HashMap map " + map);
				
	}
	public void creatEmptyMap()
	{
		Set<Integer>st = map.keySet();
	/*	Integer a[]=st.toArray(new Integer[st.size()]);
		int i=0;
		while(!map.isEmpty())
		{
			map.remove(a[i]);
			i++;
		}
		System.out.println(map);
	*/
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
		System.out.println(map);
	}
	
	public static void main(String[] args)
	{
		Assign_14 as = new Assign_14();
		as.creatMAp();
		as.creatEmptyMap();

	}

}
