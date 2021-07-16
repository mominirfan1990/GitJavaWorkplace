
class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("My Tast1 Thread ");
	}
}
public class AnanomusClassThread extends Thread
{

	public static void main(String[] args)
	{
		MyThread1 t1= new MyThread1();
		t1.start();
		
		Thread  t2= new AnanomusClassThread() 
		{
			@Override
			public void run()
			{
				System.out.println("My Thread  Ananomus ");
			}
		};
		t2.start();
	}

}
