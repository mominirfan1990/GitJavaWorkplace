//18. WAP to iterate the elements in the arraylist stored in the above Map.
package HashMapAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Assign_18 {
	List <Integer>list= new ArrayList<>();
	public void creatArrayList()
	{
		list.add(45);
		list.add(45);
		list.add(23);
	}
	Map <Integer, ArrayList >map;
	public void creatMap()
	{
		map=new HashMap<>();
		map.put(11, (ArrayList) list);
		System.out.println(map);
		
		Collection<ArrayList> cs=map.values();
		Iterator <ArrayList>itr = cs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
	
	public static void main(String[] args) 
	{
		Assign_18 as= new Assign_18();
		as.creatArrayList();
		as.creatMap();
	
	}

}
