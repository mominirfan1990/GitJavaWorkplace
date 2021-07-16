package IteratorExmpl;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo
{
	ArrayList<Integer> list;
	Iterator<Integer> itr;
	public void iteratorMethods()
	{
		list= new ArrayList<>();
		list.add(12);
		list.add(33);
		list.add(45);
		list.add(76);
		list.add(78);
		list.add(34);
		list.add(78);
		
		itr=list.iterator();	
		
		while(itr.hasNext()) // hasNext() return true if next element is present
		{
			if(itr.next()==33)  // next() method returns next element of iteration
				itr.remove();    // void method remove 
		}
		System.out.println(list);
	}

	public static void main(String[] args)
	{
		IteratorDemo id = new IteratorDemo();
		id.iteratorMethods();

	}

}
