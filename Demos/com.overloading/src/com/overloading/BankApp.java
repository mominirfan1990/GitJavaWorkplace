package com.overloading;

class FDAccount
{
	int acid;
	String name;
	float balance;
	
	public void display()
	{
		System.out.println("Welcome Your FD Account Opened Successfully");
		System.out.println("Account Number is = "+ acid);
		System.out.println("Account Holder name is = "+ name);
		System.out.println("Account balnce is = "+ balance);
	}
}


class LoanAccount
{
	int acid;
	String name;
	Float balance;
	
	public void display()
	{
		System.out.println("Welcome Your Loan Account Opened Successfully");
		System.out.println("Account Number is = "+ acid);
		System.out.println("Account Holder name is = "+ name);
		System.out.println("Account balnce is = "+ balance);
	}

}

class SavingAccount
{
	int acid;
	String name;
	Float balance;
	
	public void display()
	{
		System.out.println("Welcome Your Saving Account Opened Successfully");
		System.out.println("Account Number is = "+ acid);
		System.out.println("Account Holder name is = "+ name);
		System.out.println("Account balnce is = "+ balance);
	}

	
}


public class BankApp 
{

	public void openAccount(FDAccount a)
	{
		System.out.println();
		a.display();
		
	}
	public void openAccount(LoanAccount b)
	{
		System.out.println();
		b.display();
	}
	public void openAccount(SavingAccount c)
	{
		System.out.println( );
		c.display();
	}
	
}









