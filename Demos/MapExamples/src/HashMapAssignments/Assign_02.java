//WAP add elements to HashMap without using generics, 0th location use String as key and Integer as value,
//on 1st location use String as key String and Integer as value.
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_02
{
	Map map;
	public void creatHashMap()
	{
		map=new HashMap();
		map.put("Name", 992287);
		map.put("CustId",234562);
		System.out.println(" non generic map "+map);
	}
	public static void main(String[] args)
	{
		Assign_02 as= new Assign_02();
		as.creatHashMap();
	}

}
