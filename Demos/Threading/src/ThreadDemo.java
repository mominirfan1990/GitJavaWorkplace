
class MyThreadChar extends Thread 
{
	public MyThreadChar(String str)
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
			} catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Thread t1 done ");
	}
}
/*
class MyThreadEven extends Thread {

	public void run()
	{
		System.out.println("\n\n Thread name  '" + this.getName() + "'  Priority =" + this.getPriority());
		System.out.println(" Thread Class '" + this.getClass() + "'");
		int i = 1, count = 0;
		while (count <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println("Thread t2 done ");
	}
}
*/
class MyTask1 implements Runnable
{

	@Override
	public void run() 
	{
		
		int i = 1, count = 0;
		while (count <= 15) 
		{
			try 
			{
				Thread.sleep(100);
				if (i % 5 == 0)
				{
					System.out.print(i + " ");
					count++;
				}
				i++;
			} catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Thread t3 done ");
	}
}

public class ThreadDemo {

	public static void main(String[] args) 
	{
		
		MyThreadChar t1 = new MyThreadChar("CharThread");
		//t1.setPriority(MyThreadChar.MIN_PRIORITY);
		//t1.start();
				
	//	MyThreadEven t2 = new MyThreadEven();
	//	t2.setPriority(t2.MAX_PRIORITY);
	// 	t2.start();
		
	 	
	 	Runnable runnabletask =new MyTask1();
	 	
	 	Thread t3= new Thread(runnabletask);
	 	t3.start();
		
	}

}
