// WAP to remove all elements from ArrayList
package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_09 {
	ArrayList list;
	public void removeAll()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		System.out.println("ArrayList "+list);
		
		list.removeAll(list);
		System.out.println("ArrayList After Remove All element "+list);
	}

	public static void main(String[] args) {
		Assign_09 as= new Assign_09();
		as.removeAll();
	}

}
