package LinkListExp;

import java.util.LinkedList;

public class Assign_08 {

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
		
		li.addLast(22);
	
		System.out.println(li);
	}
	public static void main(String a[])
	{
		Assign_08 as= new Assign_08();
		as.makelist();
	}


}
