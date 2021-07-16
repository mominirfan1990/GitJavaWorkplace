package FactoryDesignPattern;

public class Shopping {

	public static void main(String[] args) 
	{
		PaymentMode p =PayOptionFactory.getPayment("CreditCard");
		doTransection(p);
	}
	public static void doTransection(PaymentMode p)
	{
		p.pay();
	}
}
