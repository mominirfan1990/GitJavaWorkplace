package MarchPaperQ;

class Performance
{
	static int pstud=2;
	static int mstud=3;
	boolean flag=true;
	public synchronized void getPunePerformance()
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
			System.out.println(" Perfornamce by Pune Student");
			pstud--;
			flag=true;
			notify();
		}
	}
	public synchronized void getMumbaiPerformance()
	{
		if(!flag )
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
			System.out.println(" performance by mumbai student ");
			mstud--;
			flag=false;
			notify();
		}

	}
}
class Pune extends Thread
{
	Performance p;
	Pune(Performance p)
	{
		this.p=p;
	}
	
	public void run()
	{
		while(p.pstud>0)
		{
			p.getPunePerformance();
		}
	}
}
class Mumbai extends Thread
{
	Performance p;
	Mumbai(Performance p)
	{
		this.p=p;
	}
	public void run()
	{
		while(p.mstud>0)
		{
			p.getMumbaiPerformance();
		}
	}
}
public class PerformanceofStudUsingThreads 
{

	public static void main(String[] args)
	{
		Performance p= new Performance();
		Pune pn= new Pune(p);
		Mumbai mb = new Mumbai(p);
		pn.start();
		mb.start();
	}

}
