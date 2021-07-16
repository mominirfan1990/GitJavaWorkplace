package LinkListExp;

import java.util.LinkedList;
import java.util.Scanner;

public class Assign_12 
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
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter element want to remove ");
		int ele=sc.nextInt();
		for(int i=0; i<li.size(); i++)
		{
			if(li.get(i)==ele)
			{
				li.remove(i);
			}
		}
		System.out.println("List After Removal "+"\n"+li);
		sc.close();
	}
	public static void main(String []a)
	{
		Assign_12 as= new Assign_12();
		as.makelist();
		as.removeEle();
		
	}
}
