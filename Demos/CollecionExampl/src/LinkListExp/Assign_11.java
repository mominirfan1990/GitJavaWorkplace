package LinkListExp;

import java.util.LinkedList;

public class Assign_11 
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
	public void display()
	{
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i)+" Position "+(i+1));
		}
		
	}
	public static void main(String []a)
	{
		Assign_11 as= new Assign_11();
		as.makelist();
		as.display();
		
	}
}
