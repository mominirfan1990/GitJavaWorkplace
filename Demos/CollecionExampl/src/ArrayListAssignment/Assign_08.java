// WAP to remove  elements from ArrayList
package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign_08 {
	ArrayList <Integer>list;
	public void removeEle()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		System.out.println("ArrayList "+list);
		
		list.remove(1);
		System.out.println("ArrayList After Remove 1st index element "+list);
		
		List<Integer>synlist;
		synlist=Collections.synchronizedList(list);  // to synchronised list
		System.out.println(synlist);
		synlist.add(100);
		System.out.println(list);
		list.add(200);
		System.out.println(synlist);
	}


	public static void main(String[] args) {
		Assign_08 as= new Assign_08();
		as.removeEle();
	}

}
