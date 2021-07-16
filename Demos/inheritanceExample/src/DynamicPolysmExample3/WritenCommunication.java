package DynamicPolysmExample3;

public class WritenCommunication extends Communication
{
	String receipt;
	public void communicate(String receipt)
	{
		System.out.println(" written communication done at"+receipt);
	}
	public static void message()
	{
		System.out.println("Communication process Begins");
	}
}
