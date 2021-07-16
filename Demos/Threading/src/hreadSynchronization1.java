
class BankAccount 
{
	int acountId;
	String name;
	int balance;
	public BankAccount()
	{}
	public BankAccount(int id, String nam, int bal)
	{
		acountId=id;
		name=nam;
		balance=bal;
	}
	public void deposite(int amt)  
	{
		System.out.println("Deposite transection started ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			balance=balance+amt;
			System.out.println("Transcetion Done ");
			System.out.println("Updated balanc "+balance);
		
	}
}
class Bank implements Runnable
{
	BankAccount o;	
	Bank(BankAccount o)
	{
		this.o=o;
	}
	public void run() 
	{
		System.out.println("Welcome to IDBI Bank ");
		synchronized(o)   
		{
			o.deposite(5000);
		}
		System.out.println("Thanks for visiting ");
	}
}
public class  hreadSynchronization1 
{

	public static void main(String[] args)
	{
		BankAccount ac= new BankAccount(101,"Irfan",15000);
		Bank IDBI = new Bank(ac);
		Thread user1= new Thread(IDBI);
		user1.start();
		Thread user2= new Thread(IDBI);
		user2.start();
	}

}
