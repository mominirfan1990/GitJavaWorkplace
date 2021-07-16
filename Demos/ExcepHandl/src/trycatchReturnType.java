class Calculation
{
	public int cal(int i,int j)
	{
		int div=0;
		try
		{
			div= i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			
		}
		return div;
	}
}
public class trycatchReturnType
{
	public static void main(String []args)
	{
		Calculation cl = new Calculation();
		System.out.println(cl.cal(40, 0));
	}
}
