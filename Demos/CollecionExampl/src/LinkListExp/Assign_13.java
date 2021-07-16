package LinkListExp;

import java.util.LinkedList;
import java.util.Scanner;

public class Assign_13
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
		li.removeFirst();
		li.removeLast();
		System.out.println("List After Removal "+"\n"+li);
	}	
	public static void main(String []a)
	{
		Assign_13 as= new Assign_13();
		as.makelist();
		as.removeEle();
		
	}
}
