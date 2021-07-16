package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateElement 
{
	ArrayList<Integer> list;
	ArrayList<Integer> temp;
	public void findDuplicate()
	{
		list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(7);
		
		temp=new ArrayList<>();
		for(int i=0; i<list.size(); i++)
		{
			
			if((Collections.frequency(list, list.get(i)))>1 && !temp.contains(list.get(i)))
			{
				System.out.println("Duplicate Element is "+ list.get(i));
				temp.add(list.get(i));
				
			}
		}
		
	}
	public static void main(String[] args) 
	{
		DuplicateElement ed = new DuplicateElement();
		ed.findDuplicate();
	}

}
