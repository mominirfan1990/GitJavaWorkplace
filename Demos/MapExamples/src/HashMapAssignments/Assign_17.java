//17. WAP to create a map which stores an arraylist as a value.

package HashMapAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assign_17
{
	ArrayList <Integer>list= new ArrayList<>();
	public void creatArrayList()
	{
		list.add(45);
		list.add(45);
		list.add(23);
	}
	Map <Integer, ArrayList<Integer> >map;
	public void creatMap()
	{
		map=new HashMap<>();
		map.put(11, list);
		System.out.println(map);
		
	}
	
	
	public static void main(String[] args) 
	{
		Assign_17 as= new Assign_17();
		as.creatArrayList();
		as.creatMap();
	
	}
}
