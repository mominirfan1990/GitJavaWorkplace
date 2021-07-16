package LinkListExp;

import java.util.LinkedList;

public class Assign_07 
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
		
		li.addFirst(00);
	
		System.out.println(li);
	}
	public static void main(String a[])
	{
		Assign_07 as= new Assign_07();
		as.makelist();
	}



}
