package ThreadAssignment;

class MyTaskAdd extends Thread
{
	
	int x,y;
	public MyTaskAdd(int a, int b)
	{
		Thread.currentThread().setPriority(MIN_PRIORITY);
		x=a;
		y=b;
		
	}
	@Override
	public void run() 
	{
		System.out.println("division "+(x/y));
		System.out.println(Thread.currentThread().getName()+" "+"Priority is "+Thread.currentThread().getPriority());
	}
	
}
class MyTaskMult extends Thread
{

	int x,y;
	public MyTaskMult(int a, int b)
	{
		Thread.currentThread().setPriority(MAX_PRIORITY);
		x=a;
		y=b;
			}
	@Override
	public void run() 
	{
		System.out.println("Multiplication "+(x*y));
		System.out.println(Thread.currentThread().getName()+" "+"Priority is "+Thread.currentThread().getPriority());

	}
	
}
public class Assign_05 {

	public static void main(String[] args)
	{
		Thread t1= new MyTaskAdd(10,3);
		t1.start();
		
		Thread t2= new MyTaskMult(6,9);
		t2.start();
	}

}
