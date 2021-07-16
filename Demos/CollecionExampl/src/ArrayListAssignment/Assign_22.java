// WAP of swap two elements in an ArrayList
package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_22 {

	public static void main(String[] args)
	{
		ArrayList<Integer >list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		System.out.println("Array List "+list);
		
		int a= list.get(1);
		int b=list.get(3);
		
		list.remove(1);
		list.add(1, b);
		list.remove(3);
		list.add(3, a);
		
		System.out.println("Array List After Swap "+ list);
		
	}

}
