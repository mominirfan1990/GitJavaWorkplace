package CompareAndComparatorExm;

import java.util.ArrayList;
import java.util.Collections;

public class EMpMain 
{
	ArrayList<Employed> list;
	public void CreatList()
	{
		list=new ArrayList<>();
		list.add(new Employed ("Irfan", "Production",40000));
		list.add(new Employed ("Omkar", "Mechanical",30000));
		list.add(new Employed ("Ganes", "Electrical",50000));
		list.add(new Employed ("Vishl", "Computer ",40000));
		list.add(new Employed ("Bipin", "Production",60000));
	
		
		System.out.println(list);
	//	list.sort(new Employed());
		Collections.sort(list, new Employed());
		System.out.println(list);
	}
	public static void main(String []args)
	{
		EMpMain em = new EMpMain();
		em.CreatList();
	}

}
