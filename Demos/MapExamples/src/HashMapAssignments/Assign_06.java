//WAP to get only the Keys from a HashMap
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assign_06 {
	Map<Integer, String> map;

	public void creatMAp() {
		map = new HashMap<>();
		map.put(23, "Honda");
		map.put(62, "Hero");
		map.put(3, "TVS");
		map.put(814, "Honda");
		System.out.println("Generic HashMap " + map);

		Set<Integer> es = map.keySet();
		System.out.println("Keys from HashMap Usig key.Set method " + es);

	}
	public static void main(String[] args) {
		Assign_06 as = new Assign_06();
		as.creatMAp();

	}

}
