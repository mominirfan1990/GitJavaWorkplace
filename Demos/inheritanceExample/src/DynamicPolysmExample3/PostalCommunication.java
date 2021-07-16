package DynamicPolysmExample3;

public class PostalCommunication extends WritenCommunication
{
	String receipt;
	public void communicate(String receipt)
	{
		System.out.println("Postal communication done at "+receipt);
	}
	public static void message()
	{
		System.out.println("Communication process Begins ");
	}
	
}
