package com.overloading;

public class BankAppMain
{

	public static void main(String[] args) 
	{
		BankApp p = new BankApp();
			
		/*FDAccount fd  = new FDAccount();

		
		fd.acid=98765;
		fd.name = "Irfan";
		fd.balance = 50000;
		p.openAccount(fd);
		
		
		SavingAccount sa = new SavingAccount();

		sa.acid=98765;
		sa.name = "Irfan";
		sa.balance = 50000f;
		p.openAccount(sa);
		
		*/
		
		LoanAccount la = new LoanAccount();

		la.acid=98765;
		la.name = "Irfan";
		la.balance = 50000f;
		p.openAccount(la);
		
	}

}
