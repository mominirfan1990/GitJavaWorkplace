
public class BankAccountStaticApp
{

	public static void main(String[] args) 
	{
	  
		BankAccountStatic x1 = new BankAccountStatic();
		x1.acceptDetails("Irfan", 101, 500000);
		
		BankAccountStatic x2 = new BankAccountStatic();
		x2.acceptDetails("omkar", 104, 800000);
		
		
		BankAccountStatic x3 = new BankAccountStatic();
		x3.acceptDetails("Ganesh", 103, 900000);
		
		x3.show();
		BankAccountStatic.getUserCount();
	
}
}