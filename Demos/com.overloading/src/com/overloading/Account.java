package com.overloading;

public class Account
{

	long accountNo;
	String customerName;
	
	Account()
	{
		System.out.println("I am Default constructor");
		accountNo = 98765432;
		customerName = "Omkar";
	}

	Account(long x, String y)
	{
		System.out.println("I am Parameterized constructor");
		accountNo = x;
		customerName = y;
	}
	
	
	public void Display()
	{
		System.out.println("Account Number :: " + accountNo);
		System.out.println("Customer Name ::" + customerName);
	}

	
	
}



