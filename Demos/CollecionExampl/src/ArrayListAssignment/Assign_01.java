//WAP to add elements to arraylist without using generics (no <>) and print content of it where
//Integer is used. In second arraylist String is used.

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_01 
{
	ArrayList al;
	ArrayList<String> str;
	ArrayList<Integer> list;

	public void addElement() 
	{
		al = new ArrayList();
		al.add(55);
		al.add("Java");
		al.add("TQDP");
		al.add(45);
		
		str = new ArrayList<>();
		list = new ArrayList<>();

		for (Object x : al) 
		{
			if (x instanceof Integer)
				list.add((Integer) x);
			else
				str.add((String) x);
		}
		System.out.print(str);
		System.out.print(list);
	}
	public static void main(String[] args)
	{
		Assign_01 as = new Assign_01();
		as.addElement();
	}

}
