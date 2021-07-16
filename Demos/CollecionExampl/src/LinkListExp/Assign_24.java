package LinkListExp;

import java.util.LinkedList;

public class Assign_24
{
	LinkedList<Integer> li,lt;
	public void makelist()
	{
		li = new LinkedList<>();
		li.add(45);
		li.add(567);
		li.add(56);
		li.add(43);
		li.add(57);
		li.add(100);
		li.add(6);
		System.out.println("list 1"+"\n"+li);
		lt = new LinkedList<>();
		lt.add(45);
		lt.add(567);
		lt.add(56);
		lt.add(43);
		lt.add(57);
		lt.add(6);
		lt.add(100);
		System.out.println("list 2"+"\n"+lt);
	}
	public void compare()
	{
		//li.containsAll(lt);
/*		int count=0;
		for(int i=0; i<li.size(); i++)
		{
			if(0==(li.get(i).compareTo(lt.get(i))))
			{
				count++;
			}
			
		}
		if(count==li.size())
			System.out.println("List 1 and List 2 are same ");
		else
			System.out.println("List 1 and List 2 are Not same ");
*/		
		System.out.println(li.equals(lt));  // check element by element and return true(if two list are same) or false
	}
	public static void main(String a[])
	{
		Assign_24 as= new Assign_24();
		as.makelist();
		as.compare();
	}
}
