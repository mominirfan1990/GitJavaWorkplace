//WAP to match two collections

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_19
{
	ArrayList<Integer> list;
	ArrayList<Integer> list1;
	public void matchCollection()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		
		list1= new ArrayList();
		list1.add(85);
		list1.add(95);
		list1.add(15);
		
		if(list.containsAll(list1))
			System.out.println("Two Collections are match");
		
	}
	public static void main(String[] args)
	{
		Assign_19 as= new Assign_19();
		as.matchCollection();
	}

}
