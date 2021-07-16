package LinkListExp;

import java.util.LinkedList;
import java.util.Scanner;

public class Assign_09
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
	public void addElement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter position ");
		int pos=sc.nextInt();
		System.out.println("Enter element");
		int ele=sc.nextInt();
		li.add(pos, ele);
		System.out.println("After insertion ");
		System.out.println(li);
		sc.close();
	}
	public static void main(String a[])
	{
		Assign_09 as= new Assign_09();
		as.makelist();
		as.addElement();
	}

}
