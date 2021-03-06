//15. WAP to create a map using Custom class as key and any other JDK provided object as value

package HashMapAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Supply {
	int id;
	String name;

	Supply() {
	}

	Supply(int id, String nm) {
		this.id = id;
		name = nm;
	}

	@Override
	public String toString() {
		return "Supply id " + id + " Supply name " + name;
	}

	@Override
	public int hashCode() {
		return (id + name.hashCode()) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) // checked pass object is null
			return false;
		if (obj == this) // check hashcode of pass object and class object
			return true;
		Supply sp = (Supply) obj; // downcast pass Object type object into Supply type object
		if (this.getClass() != sp.getClass()) // check class type of object
			return false;
		if (this.id == sp.id && this.name.equals(sp.name)) // compare id and name
			return true;
		else
			return false;
	}

}

public class Assign_15 {
	Map<Supply, String> map;

	public void creatMap() {
		Supply s1 = new Supply(2321, "BK Publ.");
		Supply s2 = new Supply(453, "MRF");
		Supply s3 = new Supply(676, "ThumpsUp");
		Supply s4 = new Supply(453, "MRF");

		map = new HashMap<>();
		map.put(s1, "NoteBook");
		map.put(s2, "Tyers");
		map.put(s3, "ColdDrinks");
		map.put(s4, "Tubes");
		// System.out.println(map);
	}

	public void displayIterate() {
		Set<Supply> st = map.keySet();
		Iterator<Supply> itr = st.iterator();
		while (itr.hasNext()) {
			Supply rs = itr.next();
			String nm = map.get(rs);
			System.out.println("Supplier id   " + rs.id);
			System.out.println("Supplier name " + rs.name);
			System.out.println("Supplier Type " + nm);
			System.out.println();
		}
	}

	public static void main(String... a) {
		Assign_15 as = new Assign_15();
		as.creatMap();
		as.displayIterate();
	}
}
