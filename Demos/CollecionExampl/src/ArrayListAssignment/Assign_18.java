//WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign_18
{
	ArrayList<Integer> list;
	
	public void addElement()
	{
		list = new ArrayList<>();
		for(int i=1; i<=50; i++)
		{
			list.add(i);
		}
		System.out.println(list);
	}
	Iterator <Integer>itr;
	public void findEven()
	{
		System.out.println("Even  Number From List are ");
		itr = list.iterator();
		while(itr.hasNext())
		{
			int s= itr.next();
			if(s%2==0)
				System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		Assign_18 as =new Assign_18();
		as.addElement();
		as.findEven();
	}

}
