import java.util.Scanner;

public class Custmer {
	
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
	public String toString()
	{
		String str;
		str = " \n Customer Id "+ customerId+" \n customerName "+ customerName +" \n customerAddress "+customerAddress;
		return str;
	}

	public static void main(String[] args) {
		
		Custmer cs = new Custmer();
		
/*		cs.setCustomerAddress("koregaon");
		cs.setCustomerName("irfan");
		cs.setCustomerId(234);
		
		System.out.println("Customer Details are ");
		System.out.println(" id "+cs.getsetCustomerId());
		System.out.println(" Name "+cs.getCustomerName());
		System.out.println(" Address "+cs.getCustomerAddress());
	*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer ID");
		int id = sc.nextInt();
		System.out.println("Enter Customer NAme");
		String nm= sc.next();
		System.out.println("Enter Customer Address");
		String ad= sc.next();
		
		cs.setCustomerId(id);
		cs.setCustomerName(nm);
		cs.setCustomerAddress(ad);
		
		System.out.println(cs.toString());
		

	}

}
