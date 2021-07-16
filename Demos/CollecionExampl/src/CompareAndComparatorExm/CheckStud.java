package CompareAndComparatorExm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CheckStud
{
	ArrayList<Students> st1;
	public void makeList() 
	{
		st1 = new ArrayList<>();
		st1.add(new Students(13, "Omkar", 70));
		st1.add(new Students(14, "Vivek", 55));
		st1.add(new Students(15, "Irfan", 55));
		st1.add(new Students(16, "Sagar", 67));
		
		System.out.println("Before Sorting ");
		System.out.println(st1);
		
	//	Collections.sort(st1);
	//	System.out.println("After Sorting by marks using comparable ");
	//	System.out.println(st1);
		
	    Collections.sort(st1,new Students());
		System.out.println("After Sorting by id using comparator ");
		System.out.println(st1);

	}
	public static void main(String[] args)
	{
		CheckStud st = new CheckStud();
		st.makeList();
	}

}
