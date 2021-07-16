//WAP to iterate through all elements in an ArrayList using for each
package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign_06 
{
	ArrayList list;
	Iterator itr;
	public void iterateLoop()
	{
		list = new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		itr= list.iterator();
		for(Object x:list)
		{
			if(itr.hasNext())
				System.out.print(itr.next()+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		Assign_06 aa= new Assign_06();
		aa.iterateLoop();
	}

}
