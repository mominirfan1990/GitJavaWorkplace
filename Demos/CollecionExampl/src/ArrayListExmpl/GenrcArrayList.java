package ArrayListExmpl;

import java.util.ArrayList;

public class GenrcArrayList   // generic array list for Integer for achieve type safety
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>(); // creat ArrayList with generic only integer value 
		al.add(55); // add element at end of list
		al.add(35);
		al.add(60);
		al.add(40);
		System.out.println("Array List "+ al);   // display Arralist

	}

}
