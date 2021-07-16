//WAP to copy one ArrayList into another

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_31 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list,list1;
		
		list= new ArrayList<>();
		list.add(66);
		list.add(33);
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(55);
		System.out.println("Array list "+list);
		
		list1 = new ArrayList<>();
		list1.addAll(list);
		System.out.println("Array list1 "+list1);
	}

}
