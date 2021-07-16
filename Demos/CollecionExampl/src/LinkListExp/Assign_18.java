package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_18 
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
		System.out.println(li);
		
		LinkedList<Integer>lc=(LinkedList<Integer>) li.clone();
		System.out.println(lc);
	}
	public static void main(String []a)
	{
		Assign_18 as= new Assign_18();
		as.makelist();
	}

}
