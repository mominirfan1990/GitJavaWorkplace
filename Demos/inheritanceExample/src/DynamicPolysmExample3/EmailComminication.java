package DynamicPolysmExample3;

public class EmailComminication extends WritenCommunication
{
	String receipt;
	public void communicate(String receipt)
	{
		System.out.println("Email communication done at "+receipt);
	}
	public static void message()
	{
		System.out.println("Communication process Begins");
	}
}
