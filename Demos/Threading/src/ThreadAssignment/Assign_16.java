package ThreadAssignment;

class MyTask11  extends Thread
{
	@Override
	public void run() 
	{
		int i=1;
		while(i<11)
		{
			try 
			{
				sleep(500);
				System.out.println(i);
				i++;
			} 
			catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
	
}
class MyTask12 extends Thread
{
	@Override
	public void run() 
	{
		char ch='a';
		while(ch<='h')
		{
			
			try 
			{
				sleep(500);
				
				System.out.println(ch);
				ch++;
			} 
			catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
	
}
public class Assign_16 {

	public static void main(String[] args) 
	{
		MyTask12 t2= new MyTask12();
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
		try 
		{
			t2.join();
		
		} catch (InterruptedException e) 
		{
	 	 System.out.println(e.getMessage());
		}
		 
		MyTask11 t1= new MyTask11();
		t1.start();
		
	}

}
