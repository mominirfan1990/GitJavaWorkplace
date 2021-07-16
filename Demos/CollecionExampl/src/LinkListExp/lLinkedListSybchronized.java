package LinkListExp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class lLinkedListSybchronized 
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
	public void creatSynchronized()
	{
		//LinkedList<Integer>synlist=(LinkedList<Integer>) Collections.synchronizedCollection(li);
		//Collection sync=Collections.synchronizedCollection(li);
		//System.out.println(sync);
		
		List<Integer>synlist=Collections.synchronizedList(li);
		System.out.println(" Synchronized List ");
		System.out.println(synlist);
	}
	public static void main(String []a)
	{
		lLinkedListSybchronized as= new lLinkedListSybchronized();
		as.makelist();
		as.creatSynchronized();
	}

}
