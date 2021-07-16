package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ArrayListAssignment.Assign_08;

public class ArrayListSnchronize 
{
	ArrayList <Integer>list;
	public void synchronizeEle()
	{
		list=new ArrayList();
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		System.out.println("ArrayList "+list);
		
		List<Integer>synlist;
		synlist=Collections.synchronizedList(list);  // to synchronised list
		
		System.out.println(synlist);
		synlist.add(100);
	
		System.out.println(list);
		list.add(200);
		System.out.println(synlist);
	}


	public static void main(String[] args) 
	{
		ArrayListSnchronize as= new ArrayListSnchronize();
		as.synchronizeEle();
	}


}
