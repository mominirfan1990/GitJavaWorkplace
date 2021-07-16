package classTest;

import java.util.Iterator;
import java.util.PriorityQueue;

//Q5. Consider Order class with ordId ,ordqty ,custname.  Create Queue of Order type Objects, 
//in which Orders with high quantity should be served first. 

class Order implements Comparable<Order>
{
	int ordId,ordQnty;
	String custName;
	public Order(int ordId, int ordQnty, String custName)
	{
		this.ordId = ordId;
		this.ordQnty = ordQnty;
		this.custName = custName;
	}
	@Override
	public String toString() 
	{
		return "Order [ordId=" + ordId + ", ordQnty=" + ordQnty + ", custName=" + custName + "]";
	}
	@Override
	public int compareTo(Order o) 
	{
		if(this.ordQnty>o.ordQnty)
			return -1;
		if(this.ordQnty<o.ordQnty)
			return 1;
		else
			return 0;
	}
	
	
}
public class Q_5 
{
	PriorityQueue<Order>oq;
	public void creatQueue()
	{
		Order o= new Order(1231,10,"RK INDUS");
		Order o1= new Order(3401,50,"SW INDUS");
		Order o2= new Order(5671,20,"DB INDUS");
		Order o3= new Order(2390,5,"SS INDUS");
		
		oq= new PriorityQueue<>();
		oq.add(o);
		oq.add(o1);
		oq.add(o2);
		oq.add(o3);
	}
	public void serveOrder()
	{
		while(!oq.isEmpty())
		{
			System.out.println(oq.poll());
		}
	}
	public static void main(String[] args)
	{
		Q_5 a= new Q_5();
		a.creatQueue();
		a.serveOrder();
	}

}
