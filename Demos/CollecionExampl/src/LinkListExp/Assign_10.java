package LinkListExp;

import java.util.LinkedList;
import java.util.Scanner;

public class Assign_10 
{
	LinkedList<Integer> li;

	public void makelist()
	{
		li = new LinkedList<>();
		li.add(45);
		li.add(567);
		li.add(56);
		li.add(43);
		li.add(56);
		li.add(6);
		li.add(100);
		System.out.println(li);
	}

	public void findOccurance() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Element whos occurance want to find  ");
		int ele = sc.nextInt();
/*		if (li.contains(ele)) 
		{
			for (int i = 0; i < li.size(); i++)
			{
				if (ele == li.get(i)) 
				{
					System.out.println(ele + " 1st occurance at position " + (i + 1));
					break;
				}
			}
			int count = 0;
			for (int i = 0; i < li.size(); i++) 
			{
				if (ele == li.get(i)) 
					count = (i + 1);
			}
			System.out.println(ele + " last occurance at position " + count);
		}
		else
			System.out.println("Entered Element not in List");
*/
		System.out.println("1st Occurance of "+ele+" "+li.indexOf(ele));
		System.out.println("last Occurance of "+ele+" "+li.lastIndexOf(ele));
		
		}

	public static void main(String a[]) {
		Assign_10 as = new Assign_10();
		as.makelist();
		as.findOccurance();
	}

}
