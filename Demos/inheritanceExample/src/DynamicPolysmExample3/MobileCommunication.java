package DynamicPolysmExample3;

public class MobileCommunication extends AirCommunication
{
	String receipt;
	public void communicate(String receipt)
	{
		System.out.println("Mobile communication done at  "+receipt);
	}
	public static void message()
	{
		System.out.println("Communication process Begins");
	}
}
