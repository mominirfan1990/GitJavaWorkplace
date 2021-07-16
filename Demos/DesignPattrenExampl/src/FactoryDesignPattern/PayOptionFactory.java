package FactoryDesignPattern;

public class PayOptionFactory
{
	public static PaymentMode getPayment(String sm)
	{
		if(sm.equals("CreditCard"))
			return new CreditCard();
		else if(sm.equals("DebitCard"))
			return new DebitCard();
		else
			return null;
		
	}
}
