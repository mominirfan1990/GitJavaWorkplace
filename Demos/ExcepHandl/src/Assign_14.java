// to check whether Unchecked Exception is propagated in calling stack

public class Assign_14 
{
	public void ReturnData(int i,int j)
	{
		int div=0;
		try
		{
			div =i/j;
			System.out.println("In Try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch block");
			System.out.println(" Divide by Zero ");
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args)
	{
		Assign_14 ss = new Assign_14();
		ss.ReturnData(4, 0);
		
	}
	
}
