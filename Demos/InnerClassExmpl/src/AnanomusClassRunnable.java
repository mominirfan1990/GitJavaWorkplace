class MyTastRunn implements Runnable
{

	@Override
	public void run() {
		System.out.println("in runnable thread 1");
		
	}
	
}

public class AnanomusClassRunnable implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		Runnable runner=new MyTastRunn();
		Thread t1= new Thread(runner);
		t1.start();
		
		
		Runnable an= new AnanomusClassRunnable()
		{

			@Override
			public void run() {
				System.out.println("in ananomus runnable thread 2");
				
			}
			
		};
		Thread t2 = new Thread(an);
		t2.start();

	}

	

}
