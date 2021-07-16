package LinkListExp;

import java.util.LinkedList;

public class Assign_20
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
	public void retrive()
	{
		System.out.println(li.get(0));
	
	}
		
	public static void main(String []a)
	{
		Assign_20 as= new Assign_20();
		as.makelist();
		as.retrive();
	}
}
