//WAP to replace the second element of an ArrayList with the specified element

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_23
{

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
		
		list.remove(1);
		list.add(1,100);

		System.out.println("Array List AFter replcae "+list);
		
	}

}
