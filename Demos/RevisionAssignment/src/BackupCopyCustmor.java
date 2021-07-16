import java.util.Scanner;

public class BackupCopyCustmor
{
	private int customerId;
	private String customerName,customerAddress;
	
	public void setCustomerId(int id)
	{
		customerId=id;
	}
	public void setCustomerName(String sn)
	{
		customerName = sn;
	}
	public void setCustomerAddress(String add)
	{
		customerAddress = add;
	}
	public int getsetCustomerId()
	{
		return customerId;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	
	public void copy(BackupCopyCustmor cd)
	{
		customerId = cd.customerId;
		customerName = cd.customerName;
		customerAddress = cd.customerAddress;
	}
	public String toString()
	{
		String str;
		str = " \n Customer Id "+ customerId+" \n customerName "+ customerName +" \n customerAddress "+customerAddress;
		return str;
	}

	public static void main(String[] args) {
		
		BackupCopyCustmor cd = new BackupCopyCustmor();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer ID");
		int id = sc.nextInt();
		System.out.println("Enter Customer NAme");
		String nm= sc.next();
		System.out.println("Enter Customer Address");
		String ad= sc.next();
		
		cd.setCustomerId(id);
		cd.setCustomerName(nm);
		cd.setCustomerAddress(ad);
		
		System.out.println(cd.toString());
		
		BackupCopyCustmor cd1= new BackupCopyCustmor();
		
	/*	cd1.customerId=cd.customerId;     // copy without passing object as parameter
		cd1.customerName=cd.customerName;
		cd1.customerAddress=cd.customerAddress;
	*/	
		cd1.copy(cd);   // copy by passed by object
		System.out.println(cd1.toString());
		
		
	}
}
