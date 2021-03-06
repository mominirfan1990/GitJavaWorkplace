import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	Map<Integer, String> map, map1;

	public void ceartHasgmap() {
		map = new HashMap();

		map.put(12, "Irfan");
		map.put(13, "vishal");
		map.put(16, "Sneha");
		map.put(18, null);
		
		
		System.out.println(map);
		System.out.println(map.get(12));
		
		System.out.println(map.getOrDefault(13, "Vishu"));
		
		System.out.println(map.remove(16, "Seha"));
		System.out.println(map.remove(12));
		
		
/*		System.out.println(" map "+map);
		Map syncmap=Collections.synchronizedMap(map);
		System.out.println(" Synchronised map "+syncmap);
		syncmap.put(45, "Add Sync");
		System.out.println(map);
		
		map.replace(18, "New ");
		System.out.println(syncmap);
	
		// System.out.println(map.put(12, "Vishnu")); // return old value
		/*
		System.out.println(map);
		System.out.println(map.size());

		map1 = new HashMap();

		map1.put(15, "Ganesh");
		map1.put(18, "Ram");
		map1.put(20, null);
	//	map1.put(21, null); // many value as null allowed
		map1.put(null, "Omkar");  // one key as null allowed
	//	map1.put(null,"Jan");  // for second key null replace previous null value

		map.putAll(map1);
		System.out.println(map);

		System.out.println(map.get(13));
		System.out.println(map.getOrDefault(19, "Key is not present "));

		System.out.println(map.remove(12));
		System.out.println(map);

		System.out.println(map.remove(13, "vishal"));
		System.out.println(map);

		System.out.println(map.replace(16, "Raj")); // return old value
		System.out.println(map);

		System.out.println(map.replace(18, "Ram", "Gagan")); // return boolean value true or false
		System.out.println(map);
		
		System.out.println(map.containsKey(15));  // check entered key is present or not
		System.out.println(map.containsValue("India")); // check enetered value present or not
		
		System.out.println(map.equals(map1));  // compare two map
		System.out.println(map.isEmpty()); // check map is empty or not
		
		System.out.println(map.keySet());
		
		// Iterate map using iterator
		
		Set <Integer> s=map.keySet();
		Iterator <Integer> itr = s.iterator();    // iterate through Integer type key
		while(itr.hasNext())
		{
			Integer o = itr.next();
			System.out.println(o+ " "+map.get(o) );
		}
		 
		Map<String, Integer> map3= new HashMap<>();
		map3.put("A", 123);
		map3.put("B", 126);
		map3.put("C", 128);
		map3.put("D", 129);
		
		Set<String> st=map3.keySet();
		Iterator <String> its = st.iterator();    //iterate through String type key
		while(its.hasNext())
		{
			String sd= its.next();
			System.out.println(sd+" "+map3.get(sd));
		}
	*/	
	/*	Collection <String> c =map.values();  // iterate through values 
	
		System.out.println(c);
		Iterator <String> itd = c.iterator();
		while(itd.hasNext())
		{
			System.out.println(itd.next());
		}
*/
	}

	public static void main(String[] args) {
		MapDemo hm = new MapDemo();
		hm.ceartHasgmap();
	}

}
