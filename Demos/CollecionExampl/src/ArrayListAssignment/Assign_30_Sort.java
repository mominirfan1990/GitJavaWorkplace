package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assign_30_Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(66);
		list.add(33);
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(55);
		System.out.println("Array list "+list);
		
	//	list.sort(null); 
		Collections.sort(list);
		System.out.println("Array list After Sorting "+list);
		
		Collections.reverse(list);
		System.out.println("Array list Revese order "+list);
		
	}

}
