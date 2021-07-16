


public class AnanomusByRunnableThread implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) 
	{
	
		Runnable runnabletask =new AnanomusByRunnableThread()
		{
			public void run() 
			{
			 System.out.println(" in Run" );
			}
			
	 	};
	 	Thread t1= new Thread(runnabletask);
	 	t1.start();
	 	
	 	
	}

	

}
