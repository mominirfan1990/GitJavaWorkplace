//WAP to convert collection into array

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_21 {

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
		
		Integer arr[]=list.toArray(new Integer[list.size()]);
		System.out.println("Array After conversion");
		for(Integer x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
