package LinkListExp;

import java.util.LinkedList;

public class Assign_14 
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
		li.removeAll(li);
		System.out.println("List After Removal "+"\n"+li);
		li.clear();
		System.out.println(li);
	}	
	public static void main(String []a)
	{
		Assign_14 as= new Assign_14();
		as.makelist();
		as.removeEle();
		
	}

}
