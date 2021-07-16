package LinkListExp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assign_04 {
	LinkedList<Integer> li;

	public void makelist() {
		li = new LinkedList<>();
		li.add(45);
		li.add(567);
		li.add(56);
		// li.addFirst(40);
		// li.addLast(100);
		li.add(43);
		li.add(57);
		li.add(6);
		li.add(100);

	}

	public void display()
	{
		System.out.println(li);
	}

	public void usingdesending() 
	{
		System.out.println("\n Using desending Iterator");
		
		Iterator<Integer> itr;
		itr = li.descendingIterator();
		while (itr.hasNext()) 
		{
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String a[]) {
		Assign_04 ld = new Assign_04();
		ld.makelist();
		ld.display();
		ld.usingdesending();
	}


}
