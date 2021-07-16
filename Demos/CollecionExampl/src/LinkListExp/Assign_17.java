package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_17 
{
	LinkedList<Integer> li,lt;
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
		System.out.println("list 1 "+li);
		lt = new LinkedList<>();
		lt.add(12);
		lt.add(7);
		lt.add(23);
		lt.add(45);
		lt.add(56);
		lt.add(60);
		lt.add(300);
		System.out.println("list 2 "+lt);
		li.addAll(lt);
		System.out.println("After Joining list ");
		System.out.println(li);
	
	}
	public static void main(String []a)
	{
		Assign_17 as= new Assign_17();
		as.makelist();
	}

}
