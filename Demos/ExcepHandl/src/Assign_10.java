class DenomGreatherException extends Exception
{
	
}

class throwExpcFinally
{
	public void receive( int s, int y) throws DenomGreatherException
	{
		if(s<y)
		{
			throw new DenomGreatherException();
		}
	}
}
public class Assign_10
{
	public static void main(String [] args)
	{
		throwExpcFinally ab = new throwExpcFinally();
		try
		{
			ab.receive(4, 5);
		}
		catch(DenomGreatherException e)
		{
			
		}
		finally
		{
			System.out.println();
		}
	}
}
