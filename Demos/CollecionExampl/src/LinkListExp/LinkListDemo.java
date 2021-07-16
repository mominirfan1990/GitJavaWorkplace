package LinkListExp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListDemo 
{
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

	public void usingListiterator() 
	{
		System.out.println("using Iteraor");
		ListIterator<Integer> itr = li.listIterator(5);
		while (itr.hasPrevious()) 
		{
			System.out.print(itr.previous() + " ");
		}

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
		LinkListDemo ld = new LinkListDemo();
		ld.makelist();
		ld.display();
		ld.usingListiterator();
		ld.usingdesending();
	}
}
