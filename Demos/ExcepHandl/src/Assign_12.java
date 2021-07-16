// to return int value in try and return int value in finally and see finally takes precedence.

public class Assign_12 
{

	public int ReturnData(int i,int j)
	{
		int div=0;
		try
		{
			div =i/j;
			System.out.println("In Try block");
			return div;
		}
		catch(ArithmeticException e)
		{
			
		}
		finally 
		{
			System.out.println("in Finally block");
			return div;
		}
		
	}
	public static void main(String [] args)
	{
		Assign_12 ss = new Assign_12();
		System.out.println(ss.ReturnData(4, 0));
	}
	

}
