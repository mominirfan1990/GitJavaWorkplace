
public class BankAccount 
{
	int balance,eid;
	String name;
	
	public void acceptDetails(String a, int b, int d)
	{
	
		name = a;
		eid = b;
		balance = d;
	}
	
	public void show()
	{
		System.out.println("Name = "+ name);
		System.out.println("Custmer Id = "+ eid);
		System.out.println("Balance  =" + balance );
	}
	
	public BankAccount totalBalance(BankAccount z2)
	{
		BankAccount temp = new BankAccount();
		temp.name= name;
		temp.eid = eid;
		temp.balance = balance + z2.balance;
		return temp;
	}

	
}




