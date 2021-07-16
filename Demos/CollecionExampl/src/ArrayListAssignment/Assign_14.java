//WAP to search an element from ArrayList

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_14 
{
	ArrayList <Integer> list;
	public void search()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		
		if(list.contains(75))  // using containd method
			System.out.println(" element present in list ");
		
		for(int i=0; i<list.size(); i++) // using loop
		{
			if(list.get(i)==75)
				System.out.println(list.get(i) +" element present in list ");
		}
	}
	public static void main(String[] args)
	{
		Assign_14 as= new Assign_14();
		as.search();
		
	}

}
