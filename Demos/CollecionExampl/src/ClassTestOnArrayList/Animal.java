package ClassTestOnArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class zoo1
{
	String name1;
	zoo1()
	{}
	zoo1(String s1)
	{
		name1=s1;
	}
	public String toString() 
	{
		return "zoo1 Animals =" + name1 + "]";
	}
	
}

class zoo2
{
	String name2;
	zoo2()
	{}
	zoo2(String s2)
	{
		name2=s2;
	}
	public String toString() 
	{
		return "zoo2 Animals =" + name2 + "]";
	}
}

class zoo3
{
	String name3;
	zoo3()
	{}
	zoo3(String s3)
	{
		name3=s3;
	}
	public String toString() 
	{
		return "zoo3 Animals =" + name3 + "]";
	}
}

public class Animal 
{
	ArrayList<zoo1> list;
	ArrayList<zoo2> list2;
	ArrayList<zoo3> list3;
	public void manage()
	{
		list=new ArrayList<>();
		list.add(new zoo1("lion"));
		list.add(new zoo1("tiger"));
		list.add(new zoo1("zebra"));
		list.add(new zoo1("hippo"));
		
		list2=new ArrayList<>();
		list2.add(new zoo2("giraffe"));
		list2.add(new zoo2("hippo"));
		list2.add(new zoo2("gorilla"));
	}
	public void display()
	{
		System.out.println(list);  // by using overriden toString method
		
		for(int i=0;i<list.size();i++)   // by for loop
		{
			System.out.println(list.get(i));
		}
		
		Iterator itr = list.iterator();  // by iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		ListIterator itrl=list.listIterator(); // by list iterator
		while(itrl.hasNext())
		{
			System.out.println(itrl.next());
		}
	
		for(zoo1 x:list)   // by suing for each
		{
			System.out.println(x);
		}
	}
	public void merge()
	{
		for(zoo2 cx:list2)
		{
			list.add(new zoo1(cx.name2));
		}
		System.out.println("Zoo1 afetr merge of zoo2 animal ");
		System.out.println(list);
	}
	public void cleaning()
	{
		list3= new ArrayList<>();
		int k=0;
		for(int i=2; k<3; k++)
		{
			list3.add(new zoo3(list.get(i).name1));
			list.remove(i); 
		}
		System.out.println("zoo 3 animal after shifting from zoo1");
		System.out.println(list3);
	}
	public void healthTransfer()
	{
		for(int i=0; i<list.size(); i++)
		{
			 if(list.get(i).name1.equals("tiger"))
			 {
				 list.remove(i);
				 list.add(i, new zoo1("leopard"));
			 }
		}
		System.out.println(list);
	}
	
	public void checkZebra()
	{
		boolean flag=false;
		for(zoo1 lx:list)
		{
			if(lx.name1.equals("zebra"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("zoo1 contain zebra");
		else
			System.out.println("Zoo1 dont have zebra");
	}
	public static void main(String[] args)
	{
		Animal an = new Animal();
		an.manage();
		an.display();
		an.merge();
		an.cleaning();
		an.healthTransfer();
		an.checkZebra();
		
	}

}
