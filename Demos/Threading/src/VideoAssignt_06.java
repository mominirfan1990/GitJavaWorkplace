import java.util.Scanner;

class ATM 
{
	int balance;
	ATM()
	{};
	ATM(int bal)
	{
		balance = bal;
	}
	public void widraw(int wd)
	{
			if(balance >=wd)
			{
				balance -= wd;
				System.out.println("Amount widraw Succesfully ");
			}
			else
				System.out.println("Insufficient balance ");
	}
	public void diposite(int dp)
	{
			balance += dp;
			System.out.println("Amount Diposite Succesfully ");
		
	}
	public void updateBal()
	{
			System.out.println("Available balance " + balance);
	}
	public synchronized void doOperation()
	{	
			System.out.println(Thread.currentThread().getName());
			
			Scanner sc = new Scanner(System.in);
			String st="yes";
			while(st.equalsIgnoreCase("Yes"))
			{
				
				System.out.println("----Welcome to ATM---- ");
				System.out.println(" 1. Deposite Amount ");
				System.out.println(" 2. Widraw Amount ");
				System.out.println(" 3. Balance Enquiry ");
				
				int option=sc.nextInt();
				switch(option)
				{
					case 1:
							System.out.println("Eneter amount want to deposite ");
							int amt= sc.nextInt();
							diposite(amt);
							break;
					case 2:
							System.out.println("Eneter amount want to Widraw ");
							int amt1= sc.nextInt();
							widraw(amt1);
							break;
					case 3:
							updateBal();
							break;
				}
				System.out.println("Do you want to Continue ");
				st= sc.next();
			}
			System.out.println(" Thank you for Using This ATM ");
		}
	
}	
class User1 extends Thread 
{
	ATM a;
	User1(ATM a) 
	{
		super("User-1");
		this.a = a;
		
	}
	public void run()
	{
		a.doOperation();
	}
}
class User2 extends Thread 
{
	ATM a;
	User2(ATM a) 
	{
		super("User-2");
		this.a = a;
		
	}
	public void run()
	{
		a.doOperation();
	}
}

public class VideoAssignt_06 
{
	public static void main(String[] args)
	{
		ATM b1 = new ATM(20000);
		User1 us1 = new User1(b1);
		us1.start();
		
		User2 us2 = new User2(b1);
		us2.start();


	}

}
