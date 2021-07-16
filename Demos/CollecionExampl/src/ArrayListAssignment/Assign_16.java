//WAP to retrieve an element (at a specified index) from a given ArrayList

package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_16
{
	ArrayList<Integer> list;
	public void retriveEkement(int i)
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		
		System.out.println(list.get(i));
	}
	public static void main(String[] args)
	{
		Assign_16 as = new Assign_16();
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Index which element wants to retrive ");
		int ele =sc.nextInt();
		
		as.retriveEkement(ele);
	}

}
