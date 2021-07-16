package AugestPaperQ;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

//2.Flipkart maintains a list<order> from different places .Order has (orderid,city,itemname,status).
//From this create a Map which stores key has cityname and count as no of order’s  pending in that city. 
//Data should be sorted according to city .[2]

class Order
{
	int orderid;
	String itemname,city,status;
	Order()
	{}
	Order(int oid, String itm,String ct, String st)
	{
		orderid=oid;
		itemname=itm;
		city=ct;
		status=st;
	}
	@Override
	public String toString()
	{
		return "Order id"+orderid+" Item Name "+itemname+" City "+city+" Status "+status;
	}
}
public class FlipkartMAp 
{
	LinkedList<Order>list;
	TreeMap<String,Integer>map=new TreeMap<>();
	public void createListData()
	{
		Order o1=new Order(101,"pen drive","pune","completed");
		Order o2=new Order(102,"mobile","pune","pending");
		Order o3=new Order(103,"cleaning mat","satara","pending");
		Order o4=new Order(104,"shirt","satara","completed");
		Order o5=new Order(105,"laptop","pune","pending");
		Order o6=new Order(106,"gogal","pune","completed");
		Order o7=new Order(107,"book","mumbai","pending");
		
		list=new LinkedList<>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);
		list.add(o6);
		list.add(o7);
		
		Iterator<Order>itr=list.iterator();
		Iterator<Order>itr1;
		while(itr.hasNext())
		{
			int count =0;int count1=0;
			Order od=itr.next();
			String st=od.city;
			itr1=list.iterator();
			while(itr1.hasNext())
			{
				Order od1=itr1.next();
				if(st.equals(od1.city) && od1.status.equals("pending"))
				{
					count++;
					
				}
			}
			map.put(st, count);
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		FlipkartMAp fk = new FlipkartMAp();
		fk.createListData();

	}

}
