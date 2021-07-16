//WAP to know how many elements in ArrayList

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_11 
{
	ArrayList <Integer>list;
	public void findCount()
	{
		list=new ArrayList<>();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		System.out.println(list.size()+" Elements present in ArrayList");
	}
	
	public static void main(String[] args)
	{
		Assign_11 as= new Assign_11();
		as.findCount();
	}

}
