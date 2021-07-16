package inht_Multilevel_Example3;
import java.util.Scanner;
public class Recipt extends Customer
{
	
	int bill,bill1;
	public void billGenerate()
	{
		 bill= ((this.noAdultC+this.noChildC)*this.price);
		 bill1=(int)((this.noAdultC*this.price)+((this.noChildC*(this.price*0.50))));
	}
	public void acceptDetailsRe()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("  Please choose Booking Type");
		System.out.println("a. Online Bookin        b.Offline Booking");
		System.out.println(" !! Online Booking Get 5% discount !!");
		char ad = sc.next().charAt(0);
	 
	switch(ad)
	{
		default : System.out.println("Please Choose valid Booking Method");
				break;
		case 'a':
				System.out.println("Your Booking Amount with 5% Descount is "+ (bill-(bill*0.05))+"  Rs only");
				System.out.println("Total pay with Summer Scheme is  "+(bill-(bill*0.25))+" Rs only");
				System.out.println("Pay Rs ::"+ ((bill-(bill*0.25))*0.10)+ "as Advanced to Confirm Your Booking");
				
				break;
				
		case 'b':
				System.out.println("You get 50% off for Child Booking");
				System.out.println("Your Booking Amount is "+ (bill1)+"  Rs only");
				System.out.println("Total pay with Summer Scheme is  "+(bill1-(bill1*0.10))+" Rs only");
		
				break;
	}
	}
	
	public static void main(String[] args)
	{
		
		Recipt rc = new Recipt();
		rc.acceptDetailsHot("7 Star", "Resourt", "Swimimg pool", 1000, "****");
		rc.displayDetailsHot();
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name=ss.next();
		System.out.println("Please Enter your mobile num");
		String mob=ss.next();
		System.out.println("Please Enter total number of Auldts");
		int ad=ss.nextInt();
		System.out.println("Please Enter total numbers of childs");
		int cd=ss.nextInt();
		System.out.println("Please Enter total staying dyas");
		int sd=ss.nextInt();
		
		rc.acceptDetailsCust(name, mob, ad, cd, sd);
		rc.billGenerate();
		rc.acceptDetailsRe();		
		rc.displayDetailsCust();
		
	}
	
}
