package CompareAndComparatorExm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestBike
{
	ArrayList<Bike> list;
	public void modifiedBike()
	{
		list=new ArrayList();
		list.add(new Bike(2001,"Honda",50000));
		list.add(new Bike(2001,"Hero",45000));
		list.add(new Bike(1995,"TVS",40000));
		list.add(new Bike(2000,"Bajaj",56000));
		list.add(new Bike(1998,"Toyota",70000));
		list.add(new Bike(2001,"BMW",45000));
	
		System.out.println(list);
		list.sort(null);
	//	Collections.sort(list);
		System.out.println("After Sorting list ");
		System.out.println(list);
	
		
	}
	
	public static void main(String[] args) 
	{
		TestBike tb = new TestBike();
		tb.modifiedBike();
	}

}
