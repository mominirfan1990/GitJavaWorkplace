//WAP to get only the Values from a HashMap
package HashMapAssignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assign_07 {
	Map<Integer, String> map;

	public void creatMAp() {
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		System.out.println("Generic HashMap " + map);

		Collection<String> cs = map.values();
		System.out.println("Get values from map using value method " + cs);
	}

	public static void main(String[] args) {
		Assign_07 as = new Assign_07();
		as.creatMAp();

	}

}
