package ThreadAssignment;
class MyTaskGetPriority extends Thread
{
	
	@Override
	public void run() 
	{
		System.out.println();
		System.out.println(Thread.currentThread().getName()+" "+"Priority is "+Thread.currentThread().getPriority());
	}
	
}

public class Assign_06 {


	public static void main(String[] args)
	{
		Thread t1= new MyTaskGetPriority();
		t1.start();
		
	}

}


