// creat Integer type ArrayList and show least object in Array List

package ArrayListExmpl;

import java.awt.List;
import java.util.ArrayList;

public class IntegerArrayListLeastElemnt
{
	public Integer findLeast(ArrayList<Integer>al)
	{
		int min=al.get(0);
		for(int i=1; i<al.size(); i++)
		{
			if(min>al.get(i))
			{
				min=al.get(i);
			}
		}
		return min;
		
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(55); // add element at end of list
		al.add(35);
		al.add(60);
		al.add(40);
		al.add(10);
		System.out.println("Array List "+ al);   // display Arralist
		
		System.out.println(new IntegerArrayListLeastElemnt().findLeast(al));  // by anonymous object
		
	//	IntegerArrayListLeastElemnt s = new IntegerArrayListLeastElemnt();// by creating object
	//	System.out.println(s.findLeast(al));
	
	}

}
