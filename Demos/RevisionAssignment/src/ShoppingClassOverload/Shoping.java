package ShoppingClassOverload;

public class Shoping 
{
	CreditCardd cd;
	DebitCardd db;
	
	public void DoTransections(CreditCardd cd)
	{
		cd.display();
	}
	public void DoTransection(DebitCardd db)
	{
		db.display();
	}
	
	public static void main(String [] args)
	{
		Shoping sp = new Shoping();
		CreditCardd cd = new CreditCardd();
		DebitCardd db = new DebitCardd();
		 
		// sp.DoTransection(db);
	
		sp.DoTransections(cd);
		
	}
}
