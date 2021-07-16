import java.util.Scanner;

public class BookingType 
{	
	String name;
	int mobNo, no,typ,chno,in,ot;
	float bill,amt;
	
	public void discountOffer()
	{
		System.out.println("You get 10% discount on your booking");
	}
	
	public void offLineBook(int a)
	{
		amt = a;
		bill = (((no*a)+(chno*(a/2)))*(ot-in));
		System.out.println( "Your total Bill ::"+bill);
	}
	
	public void onlineBooking(int z)
	{	
		amt = z;
		bill = (((no+chno)*z)*(ot-in));
		System.out.println("Your bill is " + bill);
	}
	public void acceptDetails()
	{
		Scanner sl = new Scanner(System.in);
		System.out.println("Please Eneter your name");
		name = sl.next();
		System.out.println("Please eneter Mobile Number");
		mobNo = sl.nextInt();
		System.out.println("Please enter Number of person ");
		no= sl.nextInt();
		System.out.println("Number of child below age 12 ");
		chno = sl.nextInt();
		System.out.println("Enter your Inn date");
		in= sl.nextInt();
		System.out.println("Enter your Out date");
		ot = sl.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println(" Your Booking is confirmed ");
		
		System.out.println(" Your Booking Datials are " + "\n Customer Name  ::"+name +"\n Customer Mobile Number ::"+ mobNo+"\n Number of person ::"+(no+chno));
		
	}
	

}
