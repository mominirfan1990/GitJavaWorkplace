//WAP to create a new ArrayList, add some colors (string) and print the collection.

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_07
{
	ArrayList<String> list;
	public void creatList()
	{
		list = new ArrayList<>();
		list.add("Green");
		list.add("Yello");
		list.add("Red");
		
		System.out.println(list);
	}

	public static void main(String[] args)
	{
		Assign_07 as= new Assign_07();
		as.creatList();
	}

}
