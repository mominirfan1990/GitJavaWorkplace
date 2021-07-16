
public class BankAccountStatic
{

	int balance,eid;
	String name;
	static int count;
	
	public void acceptDetails(String a, int b, int d)
	{
	
		name = a;
		eid = b;
		balance = d;
		count++;
	}
	
	public void show()
	{
		System.out.println("Name = "+ name);
		System.out.println("Custmer Id = "+ eid);
		System.out.println("Balance  =" + balance );
		System.out.println("Total Bank Account are ::" + count);
	}
	
	public static void getUserCount()    // also write as static public void
	{
		System.out.println("No. of bank account are  :: "+ count);
	}
	
	
	public BankAccountStatic totalBalance(BankAccountStatic z2)
	{
		BankAccountStatic temp = new BankAccountStatic();
		temp.name= name;
		temp.eid = eid;
		temp.balance = balance;
		return temp;
	}

}
