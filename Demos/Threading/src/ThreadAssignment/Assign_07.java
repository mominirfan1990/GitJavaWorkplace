package ThreadAssignment;

class MyTaskNameChange extends Thread
{
	
	@Override
	public void run() 
	{
		System.out.println();
		System.out.println(Thread.currentThread().getName()+" "+"Priority is "+Thread.currentThread().getPriority());
	}
	
}
public class Assign_07 {

	public static void main(String[] args)
	{
		Thread t1= new MyTaskNameChange();
		t1.start();
		t1.setName("MyThreadIrfan");
		
	}

}


