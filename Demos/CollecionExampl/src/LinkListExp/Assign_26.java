package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_26 
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
	public void replaceElement()
	{
		Collections.replaceAll(li, 43, 9);
		System.out.println("List after Replace "+li);
	}
	public static void main(String []a)
	{
		Assign_26 as= new Assign_26();
		as.makelist();
		as.replaceElement();
		
	}

}
