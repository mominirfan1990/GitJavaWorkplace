package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;

public class ContainsMethd {

	public static void main(String[] args)
	{
		ArrayList <Integer >al = new ArrayList<>(); // declare ArrayList with initial capacity 10
		al.add(55);
		al.add(45);
		al.add(20);
		al.add(60); 
		boolean flag=false;
		int count=0;
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)==45)
			{
				flag = true;
				count++;
			}
		}
		if(flag==true)
			System.out.println("45 contain in ArrayList "+count+" times");
		
		System.out.println(al.contains(45));
		
	}

}
