package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_25
{
	LinkedList<Integer> li,ls;
	public void makelist()
	{
		li = new LinkedList<>();
		li.add(45);
		ls=new LinkedList<>();
	}
	public void checkList()
	{
		if(li.isEmpty())
			System.out.println("list 1 is emplty "+li);
		else
			System.out.println("list 1 is not emplty "+li);
		
		if(ls.isEmpty())
			System.out.println("list 2 is emplty "+ls);
		else
			System.out.println("list 2 is not emplty "+ls);
	
	}
	public static void main(String a[])
	{
		Assign_25 as= new Assign_25();
		as.makelist();
		as.checkList();
	}
}
