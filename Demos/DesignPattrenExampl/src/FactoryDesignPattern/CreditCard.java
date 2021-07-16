package FactoryDesignPattern;

public class CreditCard implements PaymentMode 
{

	@Override
	public void pay() 
	{
		System.out.println("payment using CreditCard");
	}

}
