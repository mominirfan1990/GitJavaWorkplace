package ThreadAssignment;

public class Assign_01 extends Thread
{
	public void run()
	{
		System.out.println("My thread class ");
	}
	public static void main(String[] args) 
	{
		Assign_01 a1= new Assign_01();
		a1.start();
	}

}
