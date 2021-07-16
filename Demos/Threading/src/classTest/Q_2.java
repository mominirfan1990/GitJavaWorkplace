package classTest;

class MyTask1 extends Thread
{
	public void run()
	{
		System.out.println("In MyThread1 ");
	}
}
class MyTask2 extends Thread
{
	public void run()
	{
		System.out.println("In MyThread2 ");
	}
}

class MyTask3 implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("in MyClass3 Runnable ");
	}
	
}
public class Q_2 {

	public static void main(String[] args)
	{
		Thread t1= new MyTask1();
		t1.start();
		Thread t2= new MyTask2();
		t2.start();
		
		Runnable runer= new MyTask3();
		Thread t3= new Thread(runer);
		t3.start();
		Thread t4= new Thread(runer);
		t4.start();
		Thread t5= new Thread(runer);
		t5.start();
	}

}
