package testExamp;

abstract class BBike
{
	public void disply()
	{
		System.out.println("in parent ");
	}
	abstract public void run();
	
}
public class expml extends BBike
{

	@Override
	public void run() 
	{
		System.out.println("run");
	}
	@Override	
	public void disply()
	{
		System.out.println("in exmpl ");
	}
	
	public static void main(String arg[])
	{
		expml xc =new expml();
		xc.run();
		xc.disply();
	}

}
