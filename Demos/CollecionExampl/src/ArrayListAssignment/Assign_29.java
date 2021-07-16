//WAP to use add all elements to ArrayList

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_29
{

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		
		list.addAll(list1);
		System.out.println(list);
		
		list.addAll(1, list1);
		System.out.println(list);
		
	}

}
