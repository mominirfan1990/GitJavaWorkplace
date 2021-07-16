//WAP to test an ArrayList is empty or not

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_12 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		System.out.println(list);
		
		if(list.size()==0)
			System.out.println("array list is empty");
		
		if(list.isEmpty())    // using function
			System.out.println("List is empty");
	}

}
