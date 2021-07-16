//to check what happen when Exception is thrown by main method

class OuputNotBeZeroException extends Throwable
{
	String s;
	OuputNotBeZeroException(String str)
	{
		System.out.println("in OuputNotBeZeroException class");
		s=str;
	}
	public void showErr()
	{
		System.out.println(s);
	}
	
}
public class Assign_13 
{
	public int ReturnData(int i,int j)
	{
		int div=0;
		try
		{
			div =i/j;
			System.out.println("In Try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		return div;
	}
	public static void main(String [] args) throws OuputNotBeZeroException
	{
		Assign_13 ss = new Assign_13();
		int k=(ss.ReturnData(4, 0));
		if(k<=0)
		{
				throw new OuputNotBeZeroException(" output not be zero");
		
		}
	}

}
