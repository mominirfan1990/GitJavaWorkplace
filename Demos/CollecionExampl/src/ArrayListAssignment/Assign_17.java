//WAP to insert an element into the ArrayList at the first position

package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_17 
{
	ArrayList<Integer> list;
	public void insertElement(int i)
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(15);
		System.out.println("Original list "+list);
		
		list.add(0, i);
		System.out.println("List After Insertion "+list);
	}
	public static void main(String[] args)
	{
		Assign_17 as = new Assign_17();
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter element wants to insert at 1st positio ");
		int ele =sc.nextInt();
		
		as.insertElement(ele);
	
	}
}
