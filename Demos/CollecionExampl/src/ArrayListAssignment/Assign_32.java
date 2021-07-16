//WAP to compare two ArrayLists print if equal?

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_32 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list,list1;
		
		list= new ArrayList<>();
		list.add(66);
		list.add(33);
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(55);
		
		list1=new ArrayList<>();
		list1.add(66);
		list1.add(33);
		list1.add(44);
		list1.add(11);
		list1.add(22);
		list1.add(55);
		
		if(list.size()==list1.size())
		{
		/*	if(list.containsAll(list1)) // check element in list not sequence
			{
				System.out.println("ArayList are equal");
			}
			else
				System.out.println("Array list Are not equal");
			
		*/	boolean flag=true;
			for(int i=0; i<list.size();i++)  // check element by sequence
			{
				if(list.get(i)!=list1.get(i))
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println("ArayList are equal");
			else
				System.out.println("Array list Are not equal");
		}
		else
			System.out.println("Array list Are not equal");
	}

}
