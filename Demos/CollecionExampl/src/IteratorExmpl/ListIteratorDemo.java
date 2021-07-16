package IteratorExmpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo
{
	ArrayList list;
	ListIterator itr;
	
	public void listIteratorMothods()
	{
		list=new ArrayList();
		list.add(55);
		list.add(56);
		list.add("ABC");
		list.add(10);
		
		itr=list.listIterator();
		while(itr.hasNext())
		{
			if(itr.next()=="ABC")
			{
				itr.add("DEF");
			}
		}
		System.out.println("Original list "+list);
		while(itr.hasPrevious())  //Returns true if this list iterator has more elements when traversing the list in the reverse direction
		{
			if(itr.previous()==(Integer)55)
				itr.remove();
		}
		System.out.println(list);
	}
	public static void main(String[] args) 
	{
		ListIteratorDemo ltd = new ListIteratorDemo();
		ltd.listIteratorMothods();
	}

}
