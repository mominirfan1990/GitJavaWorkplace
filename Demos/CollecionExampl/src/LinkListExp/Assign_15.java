package LinkListExp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Assign_15 
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
	public void swapEle()
	{
	/*	int temp = li.get(3);
		int tem2=li.get(5);
		li.remove(3);
		li.add(3, tem2);
		li.remove(5);
		li.add(5, temp);
	*/	
		Collections.swap(li, 2, 5); 
		System.out.println("After swap "+"\n"+li);	
	}	
	public static void main(String []a)
	{
		Assign_15 as= new Assign_15();
		as.makelist();
		as.swapEle();
		
	}

}
