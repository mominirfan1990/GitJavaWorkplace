package LinkListExp;

import java.util.LinkedList;

public class Assign_19
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
	public void removeEle()
	{
		System.out.println(li.removeFirst());
		
	}
		
	public static void main(String []a)
	{
		Assign_19 as= new Assign_19();
		as.makelist();
		as.removeEle();
	}
}
