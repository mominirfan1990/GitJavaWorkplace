package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_16
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
		System.out.println("After suffel");
		Collections.shuffle(li);
		System.out.println(li);
	}
	public static void main(String []a)
	{
		Assign_16 as= new Assign_16();
		as.makelist();
	}
}
