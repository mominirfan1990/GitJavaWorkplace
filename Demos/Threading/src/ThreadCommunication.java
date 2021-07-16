

class Market
{
	int data=100;
	boolean flag=true;
	public synchronized void produce()
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			data++;
			System.out.println(" Data Produced "+data);
			flag=true;
			notify();
		}
	}
	public synchronized void consume()
	{
		if(!flag)
		{
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Consume data "+data);
			flag=false;
			notify();
		}
	}
}
class Producer extends Thread
{
	Market m;
	public Producer() {}
	public Producer(Market m)
	{
		super("Producer thread ");
		this.m=m;
	}
	public void run()
	{
		System.out.println("Producer thread started");
		while(true)
		{
			m.produce();
		}
	}
}
class Consumer extends Thread
{
	Market m;
	public Consumer() {}
	public Consumer(Market m)
	{
		super("Consumer thread ");
		this.m=m;
	}
	public void run()
	{
		System.out.println("Consumer thread started");
		while(true)
		{
			m.consume();
		}
	}

}
public class ThreadCommunication {

	public static void main(String[] args) 
	{
		Market m= new Market();
		Producer p1= new Producer(m); 
		Consumer c1= new Consumer(m);
		c1.start();
		p1.start();
	}

}
