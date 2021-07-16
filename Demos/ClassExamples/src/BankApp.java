
public class BankApp 
{

	public static void main(String[] args) 
	{
	  
		BankAccount x1 = new BankAccount();
		x1.acceptDetails("Irfan", 101, 500000);
		
		BankAccount x2 = new BankAccount();
		x2.acceptDetails("omkar", 104, 800000);
		
		BankAccount x3 = new BankAccount();
		x3.acceptDetails("Irfan", 101, 900000);
		
		
		if (x1.eid== x2.eid)
		{
		BankAccount total=  x1.totalBalance(x2);
		total.show();
		}
		else if (x1.eid == x3.eid)
		{

			BankAccount total=  x1.totalBalance(x3);
			total.show();
		}
		else if (x2.eid == x3.eid)
		{
			BankAccount total=  x2.totalBalance(x3);
			total.show();
		}
		else 
		{
			System.out.println("Account does not match with other account");
		}
			
		
	}

}
