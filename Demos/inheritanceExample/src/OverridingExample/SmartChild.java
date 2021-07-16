package OverridingExample;

public class SmartChild extends Child
{
	public void doBankTransection()
	{
		super.doBankTransection();
		System.out.println("Done transection by Vertual account");
	}
	public void openAccount()
	{
		System.out.println("Open account by vertual");
	}
	
	public static void main(String[] args)
	{
		SmartChild sc = new SmartChild();
		sc.doBankTransection();
	}
}
