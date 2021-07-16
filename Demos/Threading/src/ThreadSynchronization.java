class Account implements Runnable
{
	int acountId;
	String name;
	int balance;
	public Account()
	{}
	public Account(int id, String nam, int bal)
	{
		acountId=id;
		name=nam;
		balance=bal;
	}
	public  void deposite(int amt)  // by using synchronized block
	{
		System.out.println("Deposite transection started ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		synchronized(this)  // with synchronized block we need to pass reference 
		{
			balance=balance+amt;
			System.out.println("Transcetion Done ");
			System.out.println("Updated balanc "+balance);
		}
	}
/*	public synchronized void deposite(int amt)   // by using synchronized method 
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
*/	
	public void run() 
	{
		System.out.println("Welcome to IDBI Bank ");
		deposite(5000);
		System.out.println("Thanks for visiting ");
	}

}
public class ThreadSynchronization {

	public static void main(String[] args)
	{
		Account ac= new Account(101,"Irfan",15000);
		
		Thread user1= new Thread(ac);
		user1.start();
		Thread user2= new Thread(ac);
		user2.start();
	}

}
