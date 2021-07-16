package ThreadAssignment;

public class Assign_08 extends Thread
{
	public void run() 
	{
		System.out.println();
		System.out.println(Thread.currentThread().getName()+" "+"Priority is "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args)
	{
		Thread t1= new Assign_08();
		t1.start();
		t1.setPriority(15);  // priority greather than 10 gives IllegalArgumnetException 
		t1.setName("MyThreadIrfan");
		
	}

}
