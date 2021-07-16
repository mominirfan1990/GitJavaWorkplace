package OverridingExample;

public class Parent
{
	public  void doBankTransection()
	{
		this.openAccount();
		System.out.println("Totarnsection with stay in Q with pass book");
	}
	public void openAccount()
	{
		System.out.println("Open account with traditonal way");
	}
}
