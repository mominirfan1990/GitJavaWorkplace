import java.util.Scanner;

public class Customer
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("       Welcome to Hotel Booking System");
		System.out.println("   Please Choose which City you want to Book");
		System.out.println("\t\t  a. Pune " );
		System.out.println("\t\t  b. Mumbai " );
		char ch = sc.next().charAt(0);
		char a,b;
	
		
		switch(ch)
		{
			default : System.out.println("Please Select Valid City  !!!");
					break;
					
			case 'a':
				     Hotel h1 = new Hotel();
				     h1.bokingPune();
				     break;
			  	     
					
			case 'b':
					
					Hotel h2 = new Hotel();
					h2.bokingMumbai();
					break;
					
		}
		
	}
}
