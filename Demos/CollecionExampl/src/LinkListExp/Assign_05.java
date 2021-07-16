package LinkListExp;

import java.util.LinkedList;

public class Assign_05 
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
		li.add(3, 400);
		System.out.println(li);
	}
	public static void main(String a[])
	{
		Assign_05 as= new Assign_05();
		as.makelist();
	}

}
