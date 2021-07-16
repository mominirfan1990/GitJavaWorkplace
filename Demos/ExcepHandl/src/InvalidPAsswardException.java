
public class InvalidPAsswardException extends Exception 
{
	String srr=new String();
	InvalidPAsswardException(String msg)
	{
		srr=msg;
	}
	public void showErr()
	{
		System.out.println(srr);
	}
	
	
}
