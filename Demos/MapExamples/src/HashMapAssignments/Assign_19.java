//19. WAP to create a Map which stores another Map as a value.

package HashMapAssignments;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assign_19
{
	Map<Integer, String> map;
	Map<String, Map> map1;
	
	public void creatMAp() 
	{
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		
		map1=new HashMap<>();
		map1.put("Bike", map);
		
		System.out.println(map1);
	}
	Map<Integer, String> map2,map4;
	Map<String, Map> map3;
	public void creatvoter()
	{
		map2=new HashMap<>();
		map2.put(2334, "Irfan");
		map2.put(2335, "Vishal");
		map2.put(2336, "omkar");
		map2.put(2337, "Deepak");
		
		map4=new HashMap<>();
		map4.put(335, "Vishnu");
		map4.put(336, "Shree");
		map4.put(337, "Deepika");
				
		map3=new HashMap<>();
		map3.put("Vote 1", map2);
		map3.put("Vote 2", map4);
		
	
		Set<Entry<String, Map>>st=map3.entrySet();
		Iterator<Entry<String, Map>> itr=st.iterator();
			 
		 while(itr.hasNext())
		{
			Entry<String, Map>et=itr.next();
			System.out.println(et.getKey());
			
			Map<Integer, String> ms= et.getValue();	
			
			Set<Entry<Integer, String>>e1=ms.entrySet();
			Iterator<Entry<Integer, String>>itf=e1.iterator();
			while(itf.hasNext())
			{
				System.out.println(itf.next());
			}
		}
		
	}
	public static void main(String[] args)
	{
		Assign_19 as= new Assign_19();
		as.creatMAp();
		as.creatvoter();
	}

}
