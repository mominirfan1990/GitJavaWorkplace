// WAP to retain all elements from ArrayList
package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_10 {
	ArrayList <Integer>list;
	ArrayList<Integer> list1;
	public void retainEle()
	{
		list=new ArrayList<>();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		list1= new ArrayList<>();
		list1.add(65);
		list1.add(75);
		
		System.out.println("ArrayList "+list);
		list.retainAll(list1);  // Removes from this list all of its elements that are not contained in the specified collection.


		System.out.println(list);
		
	}
	public static void main(String[] args)
	{
		Assign_10 as= new Assign_10();
		as.retainEle();	
	}

}
