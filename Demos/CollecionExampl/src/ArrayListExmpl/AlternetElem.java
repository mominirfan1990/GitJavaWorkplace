package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Stack;

public class AlternetElem
{
	ArrayList<Integer>list1;
	ArrayList<Integer>list2;
	ArrayList<Integer>list3;
	public void alternetElemnet()
	{
		list1=new ArrayList<>();
		list1.add(4);
		list1.add(5);
		list1.add(7);
		list1.add(2);
		list1.add(8);
		list1.add(9);
		
		
		list2=new ArrayList<>();
		list2.add(2);
		list2.add(99);
		list2.add(11);
		list2.add(12);
		
		list3 = new ArrayList<>();
		for(int i=0; i<list1.size();i++)
		{
			list3.add(list1.get(i));
			if(list2.size()>i)
			{
				list3.add(list2.get(i+1));
			}
			else
				list3.add(list1.get(i+1));
			i++;
		}
		System.out.println(list3);
	}
	public static void main(String[] args)
	{
		AlternetElem am= new AlternetElem();
		am.alternetElemnet();
	}

}
