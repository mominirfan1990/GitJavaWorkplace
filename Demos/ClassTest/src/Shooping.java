
public class Shooping 
{

	CreditCard cc;
	DebitCard  dc;
	
	public void doTransection(CreditCard cc )
	{
		cc.displayC();
	}
	public void doTransection(DebitCard dc )
	{
		dc.display();
	}
	
	public static void main(String[] args)
	{
		
		Shooping sp = new Shooping();
		CreditCard cc =new CreditCard();
		DebitCard  dc = new DebitCard();
		
		sp.doTransection(cc);
		sp.doTransection(dc);
		
	}
	
}
