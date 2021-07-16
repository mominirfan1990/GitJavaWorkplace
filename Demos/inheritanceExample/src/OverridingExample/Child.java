package OverridingExample;

public class Child extends Parent
{

	public void doBankTransection()
	{
		super.doBankTransection();
		System.out.println("Online transection");
	}
	public void checkBalance()
	{
		
		System.out.println("check balance online");
	}
	public void openAccount()
	{
		
		System.out.println("open account online filling form");
	}
	
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.doBankTransection();
	}

}
