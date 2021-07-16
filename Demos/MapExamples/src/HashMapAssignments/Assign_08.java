//WAP to copy all of the mappings from the specified HashMap to another map.
package HashMapAssignments;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign_08 
{
	Map<Integer, String> map,map1;

	public void creatMAp() {
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		System.out.println("HashMap map " + map);

		map1=new HashMap<>();
		map1.putAll(map);
		System.out.println();
		System.out.println("HashMap map1 after copy from map"+map1);
		
	}

	public static void main(String[] args) {
		Assign_08 as = new Assign_08();
		as.creatMAp();

	}

}
