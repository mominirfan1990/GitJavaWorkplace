package ThreadAssignment;

class MyThreadSleep extends Thread
{
	public void run()
	{
		try 
		{
			sleep(10000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		char count='a';
		while(count<'j')
		{
			try 
			{
				sleep(500,1000);
				
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(count);
			count++;
		}
	}
}
public class Assign_10_11
{
	public static void main(String...str)
	{
		Thread t1= new MyThreadSleep();
		t1.start();
	}
}
