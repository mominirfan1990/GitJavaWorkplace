import java.util.Scanner;
public class shirthBillTernary 
{
	public static void main(String[] args)
	{
		int quanty,Fixprice,bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Eneter Shirt Quantity You Want to Purchase");
		quanty=sc.nextInt();
		Fixprice=500;
		bill = (quanty*Fixprice);
		
		int max = bill>2000 ? (bill=(bill-(bill*10)/100)) : bill>1000  ? (bill=(bill-(bill*5)/100)): bill;
		System.out.println("Your Bill of Shirt is = "+ bill);
		
		
		
		
	}
	
}
