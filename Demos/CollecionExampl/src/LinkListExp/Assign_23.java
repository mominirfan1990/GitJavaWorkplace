package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_23 
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
	}
	public void convertToArray()
	{
		Integer arr[]=li.toArray(new Integer[li.size()]);
	
		System.out.println(" Converted Array ");
		for(Integer x:arr)
		{
			System.out.print(x+" ");
		}
		LinkedList<Integer>synlist=(LinkedList<Integer>) Collections.synchronizedCollection(li);
	}
	public static void main(String []a)
	{
		Assign_23 as= new Assign_23();
		as.makelist();
		as.convertToArray();
	}
}
