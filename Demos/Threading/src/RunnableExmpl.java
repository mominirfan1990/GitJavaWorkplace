class Numberd implements Runnable
{

	int a,b,c,d;
	double avg;
	public Numberd(int a, int b, int c, int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void run() 
	{
	 avg=((a+b+c+d)/4);
	 System.out.println(" Average is "+avg);
	}
	
}

public class RunnableExmpl {

	public static void main(String[] args) 
	{
	
		Runnable runnabletask =new Numberd(3,5,7,10);
	 	Thread t1= new Thread(runnabletask);
	 	t1.start();
	 	
	 	Thread t2= new Thread(runnabletask);
	 	t2.start();
	
	 	Thread t3= new Thread(runnabletask);
	 	t3.start();
	 	
	}

}
