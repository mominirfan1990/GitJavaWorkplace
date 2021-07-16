package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_20 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(1);
		
		System.out.println(list);
		
		if(list.size()==0)
			System.out.println("array list is empty");
		
		if(list.isEmpty())    // using function
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");

	}

}
