//WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it.
// Use Integer as Key and String as Value. 
//In second HashMap add elements of String type as Key and Integer as Value.

package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_01 
{
	Map map;
	public void creatHashMap()
	{
		map=new HashMap();
		map.put(10, "Irfan");
		map.put("CustId",234562);
		System.out.println(" non generic map "+map);
	}
	public static void main(String[] args)
	{
		Assign_01 as= new Assign_01();
		as.creatHashMap();
	}

}
