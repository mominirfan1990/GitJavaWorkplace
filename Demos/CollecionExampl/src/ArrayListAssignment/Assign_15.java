//WAP to search the specified collection in this collection

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_15
{
	ArrayList <Integer> list;
	ArrayList<Integer> list1;
	public void search()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		
		list1= new ArrayList();
		list1.add(75);
		list1.add(85);
		list1.add(95);
		
		if(list.containsAll(list1))
			System.out.println(list1+ " Present in List");
		else
			System.out.println("List dont have specific collection");
		
	}

	public static void main(String[] args) {
		Assign_15 as= new Assign_15();
		as.search();
	}

}
