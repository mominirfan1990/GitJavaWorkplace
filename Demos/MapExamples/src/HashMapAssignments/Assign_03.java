//WAP to add elements to a HashMap using generics with Integer as Key and String as value.
//And 4 key-value Map.Entry
package HashMapAssignments;

import java.util.HashMap;

public class Assign_03 {
	HashMap<Integer, String> map;

	public void addElement() {
		map = new HashMap<>();
		map.put(11, "Honda");
		map.put(12, "Hero");
		map.put(13, "TVS");
		map.put(14, "Honda");
		System.out.println("Generic HashMap " + map);
	}
	public static void main(String... a) {
		Assign_03 as = new Assign_03();
		as.addElement();
	}
}
