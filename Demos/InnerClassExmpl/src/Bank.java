
public class Bank
{
	public String bankName;
	private int ifscCode;
	int id=120;
	public void getBankServices()
	{
		System.out.println("Avaialing Bank Service");
	}
	class Locker
	{
		int lid;
		String owner;
		public Locker() {}		
		public Locker(int id, String o)
		{
			lid=id;
			owner=o;
		}
		public void display()
		{
			System.out.println(Bank.this.id);
			getBankServices();
			System.out.println("Using locker service ");
			System.out.println("My locker id "+lid+" Owner "+owner);
			
		}
	}
	public static void main(String[] args) 
	{
	/*	Bank b = new Bank();
		Locker l=b.new Locker(12345,"Mr.xyz");
		l.display();
	*/	
		Bank.Locker l1 = new Bank().new Locker(5678,"Mr.psy");
		l1.display();
		
		
		
	}

}
