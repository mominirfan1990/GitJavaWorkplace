// WAP to return int value in try block and return int value in finally block and observe which return takes precedence

public class Assign_11
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
		Assign_11 ss = new Assign_11();
		System.out.println(ss.ReturnData(4, 0));
	}
	
}
