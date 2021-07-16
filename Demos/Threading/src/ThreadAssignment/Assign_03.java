package ThreadAssignment;

class MyTask1 implements Runnable
{
	int x,y;
	public MyTask1(int a, int b)
	{
		x=a;
		y=b;
	}
	@Override
	public void run() 
	{
		System.out.println("division "+(x/y));
	}
	
}
public class Assign_03 {

	public static void main(String[] args) 
	{
		Runnable runert = new MyTask1(10,2);
		Thread t1= new Thread(runert);
		t1.start();
		
		Thread t2 = new Thread(runert);
		t2.start();
	}

}
