//11. WAP to search for an element from HashMap using key
package HashMapAssignments;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign_11 
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

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Integer Key to search element ");
		int key=sc.nextInt();
	/*	if(map.containsKey(key))
			System.out.println("HashMap Contains elemet "+key+"="+map.get(key));
		else
			System.out.println("Hash Map Dont contains elemet ");
	*/
		System.out.println(map.get(key));
		
		System.out.println(map.containsKey(null));
	}

	public static void main(String[] args) {
		Assign_11 as = new Assign_11();
		as.creatMAp();

	}

}
