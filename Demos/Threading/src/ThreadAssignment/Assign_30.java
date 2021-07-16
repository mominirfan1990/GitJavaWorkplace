package ThreadAssignment;

import java.util.Scanner;

class Basket
{
	int chocolate=100; int demand=0;
	Boolean flag=true;

	public synchronized void produceChocolate()
	{
		if(flag)
		{
			System.out.println("In produceChocolate if part ");
			try { wait();}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		else
		{
			System.out.println("In produceChocolate else part ");
			chocolate+=demand;
			System.out.println("Produced Chocolate"+chocolate);
			flag=true;
			notify();
		}
	}
	public synchronized void consumeChocolate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many  Chocolate ");
		int temp=sc.nextInt();
		demand=temp;
		if(!flag && chocolate<demand)
		{
			System.out.println("In consumeChocolate if part ");
			try { wait();}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		else
		{
			System.out.println("In consumeChocolate else part ");
			chocolate-=demand;
			System.out.println("Consume chocolate "+demand);
			System.out.println("Available "+chocolate);
			flag=false;
			notify();
		}
	}
}

class Consumer extends Thread
{
	Basket b;
	public Consumer(Basket b)
	{
		this.b=b;
	}
	public void run()
	{
		while(true)
		{
			b.consumeChocolate();
		}
	}
}

class Producer extends Thread
{
	Basket b;
	public Producer(Basket b)
	{
		this.b=b;
	}
	public void run()
	{
		while(true)
		{
			b.produceChocolate();
		}
	}
}
public class Assign_30 
{
	public static void main(String args[])
	{
		Basket bk = new Basket();
		Thread c1= new Consumer(bk);
		Thread p1= new Producer(bk);
		p1.start();
		c1.start();
		
	}
}