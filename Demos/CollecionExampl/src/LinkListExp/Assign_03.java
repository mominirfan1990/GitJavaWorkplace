package LinkListExp;

import java.util.Iterator;
import java.util.LinkedList;

public class Assign_03
{
	LinkedList<Integer> li;
	public void makelist() 
	{
		li = new LinkedList<>();
		li.add(45);
		li.add(567);
		li.add(56);
		li.add(43);
		li.add(57);
		li.add(6);
		li.add(100);
		
	}
	Iterator<Integer> itr;
	public void itrate()
	{
		itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) 
	{
		Assign_03 as= new Assign_03();
		as.makelist();
		as.itrate();
	}


}
