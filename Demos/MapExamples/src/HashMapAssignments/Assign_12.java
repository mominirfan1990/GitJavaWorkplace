//12. WAP to test if a HashMap contains a mapping for the specified value.
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign_12 {

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Value to search ");
		String val=sc.next();
		if(map.containsValue(val))
			System.out.println(val +"  Value is present in map ");
		else
			System.out.println(val +"  Value is NOT present in map ");
		
	}

	public static void main(String[] args) {
		Assign_12 as = new Assign_12();
		as.creatMAp();

	}


}
