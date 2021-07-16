package ClassTestOnArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Item implements Comparable<Item>
{
	int itemId,itemPrice;
	String itemName;
	Supplier sp;
	Item()
	{}
	Item(int iid, int ipr, String inm, Supplier s)
	{
		itemId=iid;
		itemPrice=ipr;
		itemName=inm;
		sp=s;
	}
	public String toString() 
	{
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemName=" + itemName +" "+ sp
				+ "]";
	}
	public int compareTo(Item o)
	{
		if(this.sp.suppName.compareTo(o.sp.suppName)<0)
			return -1;
		else if(this.sp.suppName.compareTo(o.sp.suppName)>0)
			return 1;
		else if(this.itemPrice>o.itemPrice)
			return -1;
		else if(this.itemPrice<o.itemPrice)
			return 1;
		else
			return 0;
	}
		
}
public class Q_1
{
	ArrayList<Item> list1;
	public void creatList()
	{
		list1=new ArrayList<>();
		list1.add(new Item(10,2000,"CPU",(new Supplier(101,"RK indus"))));
		list1.add(new Item(11,1500,"Moniter",(new Supplier(102,"Mr.X"))));
		list1.add(new Item(12,1000,"KeyBorad",(new Supplier(103,"RK indus"))));
	}
	public void displayDetails()
	{
		for(Item x:list1)
		{
			System.out.println(x);
		}
	}
	public void checkSupply()
	{
		for( Item xn:list1)
		{
			if(xn.sp.suppName.equals("Mr.X"))
			{
				xn.itemPrice-=50;
			}
		}
		System.out.println();
		System.out.println("After reduce price for supply mr x");
		for(Item x:list1)
		{
			System.out.println(x);
		}
	}
	ArrayList<String>sName;
	public void creatSupplName()
	{
		sName=new ArrayList<>();
		for(int j=0; j<list1.size(); j++)
		{
			sName.add(list1.get(j).sp.suppName);
		}
		System.out.println(sName);
	}
	public void sortSupp()
	{
		Collections.sort(list1);
		System.out.println();
		System.out.println("List after sorting ");
		for(Item x:list1)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args)
	{
		Q_1 it= new Q_1();
		it.creatList();
		it.displayDetails();
		it.checkSupply();
		it.creatSupplName();
		it.sortSupp();
	}

}
