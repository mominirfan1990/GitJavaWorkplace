class NullExcep
{
	public void receive() 
	{
		
	}
}
public class Assign_9 
{
	public static void main(String[] args)
	{
		try
		{
			NullExcep n=null;
			n.receive();	
		}
		catch(NullPointerException e)
		{
			System.out.println("In null pointer Exception block");
			System.out.println(e.getMessage());
		}
	}
}

