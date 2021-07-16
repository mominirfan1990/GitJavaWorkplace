package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueElement
{
	ArrayList<Integer> list;
	public void findUnique()
	{
		list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(7);
		
		for(int i=0; i<list.size(); i++)
		{
			if((Collections.frequency(list, list.get(i)))==1)
			{
				System.out.println("Unique element are "+list.get(i));
			}
		}
		
		
	}

	public static void main(String[] args)
	{
		UniqueElement ue = new UniqueElement();
		ue.findUnique();
	}

}
