package ThreadAssignment;

public class Assign_09 extends Thread
{
	public void run() 
	{
		int count=0;
		while(count<10)
		{
			System.out.println(count);
			count++;
		}
	}
	
	public static void main(String[] args)
	{
		try 
		{
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		Thread t1= new Assign_09();
		t1.start();
				
	}
}
