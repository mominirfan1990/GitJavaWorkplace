package classTest;

class Stock
{
	int qnty=1000;
	public synchronized void purchase(int demand)
	{
		
		if(qnty==0)
		{
			System.out.println(Thread.currentThread().getName()+" "+" Item Out of Stock ");
		}
		else if(qnty>=demand)
		{
			System.out.println(" Available Quantity "+qnty);
			qnty-=demand;
			System.out.println(Thread.currentThread().getName()+" "+" Purchase Done Successfully");
		}
		else
		{
			System.out.println(" Available Quantity "+qnty);
			System.out.println(Thread.currentThread().getName()+" "+" Dont have Sufficient Stock ");

		}
			
	}
}
class Purchaser1 extends Thread
{
	Stock s;
	Purchaser1(Stock s)
	{
		super("Purchaser1");
		this.s=s;
	}
	public void run()
	{
		s.purchase(20);
	}
}
class Purchaser2 extends Thread
{
	Stock s;
	Purchaser2(Stock s)
	{
		super("Purchaser2");
		this.s=s;
	}
	public void run()
	{
		s.purchase(40);
	}
}
class Purchaser3 extends Thread
{
	Stock s;
	Purchaser3(Stock s)
	{
		super("Purchaser3");
		this.s=s;
	}
	public void run()
	{
		s.purchase(1000);
	}
}
public class Q_1 {

	public static void main(String[] args)
	{
		Stock st= new Stock();
		
		Thread t1= new Purchaser1(st);
		Thread t2= new Purchaser2(st);
		Thread t3= new Purchaser3(st);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
