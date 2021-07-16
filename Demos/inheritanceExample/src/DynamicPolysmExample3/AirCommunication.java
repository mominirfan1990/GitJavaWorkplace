package DynamicPolysmExample3;

public class AirCommunication extends Communication
{
	String receipt ;
	public void communicate(String receipt)
	{
		System.out.println("Air communication done at"+receipt);
	}
	public static void message()
	{
		System.out.println("Communication process Begins");
	}
}
