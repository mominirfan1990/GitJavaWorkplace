import java.util.Scanner;
public class hotelBillSwitch
{
	public static void main(String[] args)
	{
		int p,q,bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPlease Choose any Dish From Menu");
		System.out.println("\t\t-----Menu-----");
		System.out.println("\t\t1.Vadapao");
		System.out.println("\t\t2.Misal");
		System.out.println("\t\t3.Edali sambhar");
		p= sc.nextInt();
		System.out.println(" Eneter Quantity you want..");
		q=sc.nextInt();
		
		switch (p)
		{
		case 1: System.out.println("Please Pay Bill \t"+ (bill=15*q)+ "\tand take Token ");
			   break;
		case 2: System.out.println("Please Pay Bill"+ (bill=60*q)+ "and take Token ");
		   break;
		
		case 3: System.out.println("Please Pay Bill"+ (bill=50*q)+ "and take Token ");
		   break;
		 
		default: System.out.println("Please Eneter Valid No.");
		}
		
		
		
	}

}
