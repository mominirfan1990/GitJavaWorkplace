//9. WAP to test a HashMap is empty or not
package HashMapAssignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_09
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
		System.out.println(map1);
		if(map.isEmpty())
			System.out.println("HashMap map is empty ");
		else
			System.out.println("HashMap map is NOT empty ");
		if(map1.isEmpty())
			System.out.println("HashMap map1 is empty ");
		else
			System.out.println("HashMap map1 is NOT empty ");
	}

	public static void main(String[] args) {
		Assign_09 as = new Assign_09();
		as.creatMAp();

	}

}
