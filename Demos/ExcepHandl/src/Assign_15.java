//to check whether Checked Exception is propagated in calling stack

class OuputNotBeZeroException extends Exception
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
public class Assign_15
{
	public void ReturnData(int i,int j) 
	{
		int sum=0;
		sum=i+j;
		if(sum<0)
		{
			try 
			{
				throw new OuputNotBeZeroException(" Output not be zero");
			} 
			catch (OuputNotBeZeroException e)
			{
				e.showErr();
				e.printStackTrace();
			}
		}

	}
	public static void main(String [] args) throws OuputNotBeZeroException 
	{
		Assign_15 ss = new Assign_15();
		ss.ReturnData(4, -6);
		
	}

}
