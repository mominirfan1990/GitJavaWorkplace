//10. WAP to test if a HashMap contains a mapping for the specified key.
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_10 
{
	Map<Integer, String> map,map1;

	public void creatMAp() {
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		map.put(null, "BMW");
		System.out.println("HashMap map " + map);

		if(map.containsKey(23))
			System.out.println("HashMap Contains Key ");
		else
			System.out.println("Hash Map Dont contains Key ");
	}

	public static void main(String[] args) {
		Assign_10 as = new Assign_10();
		as.creatMAp();

	}

}
