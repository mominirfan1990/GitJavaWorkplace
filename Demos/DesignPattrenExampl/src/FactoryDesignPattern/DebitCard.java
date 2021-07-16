package FactoryDesignPattern;

public class DebitCard implements PaymentMode
{

	@Override
	public void pay()
	{
		System.out.println("Payment using Debit Card");
	}

}
