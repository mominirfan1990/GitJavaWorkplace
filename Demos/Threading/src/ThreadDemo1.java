class MyThreadChart extends Thread
{
	public MyThreadChart(String str)
	{
		start();
		this.setName(str);
	}

	public void run() 
	{
		char ch = 'A';
		while (ch <= 'Z') 
		{
			try 
			{
				Thread.sleep(1000);
				System.out.print(ch + " ");
				ch++;
				if(ch=='H')
					join();
				
				
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thread t1 done ");
	}
}

class MyTask2 implements Runnable 
{
	@Override
	public void run() 
	{
		int i = 1, count = 0;
		while (count <= 20) 
		{
			try 
			{
				Thread.sleep(500);
				if (i % 5 == 0) 
				{
					System.out.print(i + " ");
					count++;
					
				}
				i++;
			}
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thread t2 done ");
	}
}

public class ThreadDemo1 {

	public static void main(String[] args)
	{
		MyThreadChart t1 = new MyThreadChart("CharThread");
	
		Runnable runnabletask = new MyTask2();
		Thread t2 = new Thread(runnabletask);
		t2.start();

	}

}
