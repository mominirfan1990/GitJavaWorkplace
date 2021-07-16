package ThreadAssignment;

class MyTask implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("MY RUNNABLE THREAD CLASS");	
	}
	
}
public class Assign_02 {

	public static void main(String[] args) 
	{
		Runnable runer=new MyTask();
		
		Thread t1= new Thread(runer);
		t1.start();
		
	}

}
