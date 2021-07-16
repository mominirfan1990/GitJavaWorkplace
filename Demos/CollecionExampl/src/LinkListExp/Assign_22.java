package LinkListExp;

import java.util.LinkedList;

public class Assign_22 
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
	public void checkElement(int i)
	{
		if(li.contains(i))
			System.out.println(i+" present in list");
		else
			System.out.println(i+" Not present in list");
	}
		
	public static void main(String []a)
	{
		Assign_22 as= new Assign_22();
		as.makelist();
		as.checkElement(100);
	}

}
