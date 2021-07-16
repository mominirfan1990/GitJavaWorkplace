//13. WAP to remove an element from HashMap using key
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign_13
{
	Map<Integer, String> map,map1;

	public void creatMAp() {
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		map.put(null, "BMW");
		map.put(1, null);
		System.out.println("HashMap map " + map);
		
		map.remove(3);
		System.out.println(map);
	}

	public static void main(String[] args) {
		Assign_13 as = new Assign_13();
		as.creatMAp();

	}

}
