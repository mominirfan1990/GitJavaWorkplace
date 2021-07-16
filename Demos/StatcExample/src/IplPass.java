
public class IplPass 
{

	int noPass;
	static int count;
	
	public void acceptDetials(int a)
	{
		noPass =a;
		count++;
	}
	
	public void PassCount()
	{
		if(count<11)
		{
			System.out.println("You Are First 10 member you get pass on 1000 Rs" );
			System.out.println(" total " +count + "  passes sold "+ "\n Total amount collected  "+ count*1000);
		}
		else if (count >10 && count <16)
		{
			System.out.println("You Are First 15 member you get pass on 1500 Rs" );
			System.out.println(" total " +count + "  passes sold "+ "\n Total amount collected  "+ (10000+((count-10)*1500)));
		}
		else if (count <21)
		{
			System.out.println("You Are late you get pass on 2000 Rs" );
			System.out.println(" total " +count + "  passes sold "+ "\n Total amount collected  "+ (10000+7500+((count-15)*2000)));
		}
		
		else
		{
		System.out.println("Sorry All passes are over");
		}
	}
	public void availabePass()
	{
		
		if(count >=20)
		{
			System.out.println("Sorry no pass available");
		}
		else
		{
		System.out.println("Hurry up only  "+ (20-count) +"   Pasess are avialable !!");
		}
	}
}
