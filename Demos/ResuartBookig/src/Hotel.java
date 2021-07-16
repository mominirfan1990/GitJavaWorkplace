import java.util.Scanner;
public class Hotel
{
	
	
	public void bokingPune()
	{
		System.out.println("Please select Hotel ");
     	System.out.println("   !!  x. OccenStar  !!"+"\n Hotel Location =  Kothrud"+ "\n Price = 1200 per night per person");
		Grade g1 = new Grade();
		System.out.println();
		System.out.println("   !!  y. NightRider !!"+"\n Hotel Location =  Swarget"+ "\n Price = 900 per night per person");
		Grade g2 = new Grade(1);
		System.out.println();
		System.out.println("   !!  z. Skyeis     !!  "+" \n Hotel Location =  Pimpri"+ "\n Price = 1000 per night per person");
		Grade g3 = new Grade ("a");
		
		 Scanner sc = new Scanner(System.in);
		 char ch = sc.next().charAt(0);
		 char  x,y,z;
		 
		 switch(ch)
		 {

			default : System.out.println("Please Eneter Valdi Hotel Id !!!");
					break;
					
			case 'x':
						System.out.println("  Welcome to  OccenStar Hotel ");
						System.out.println();
						System.out.println("Which booking method you want used");
						System.out.println();
						System.out.println(" If you booked online you get 10% discount");
						System.out.println();
						System.out.println("l.online Booking "+"  m.Offilene Booking");
						Scanner sd= new Scanner (System.in);
						char cc = sd.next().charAt(0);
						char l,m;
						
						 switch (cc)
						 {
						 	default :System.out.println("Please Choose valid method ");
									break;
							case 'l':
								    BookingType b1= new BookingType();
									b1.acceptDetails();
									b1.discountOffer();
									b1.displayDetails();
									b1.offLineBook(1200);
									System.out.println("\n Hotel Name :: OccenStar ");
									break;
																		 
							case 'm':
									BookingType b2= new BookingType();
									b2.acceptDetails();
									b2.displayDetails();
									b2.offLineBook(1200);
									System.out.println("\n Hotel Name :: OccenStar ");
									break;
						}
						 break;
						 
						
			case 'y':
					System.out.println("Welcome to  OccenStar Hotel ");
					System.out.println("Which booking method you want used");
					System.out.println(" If you booked online you get 10% discount");
					System.out.println("l.online Booking "+"\n m.Offilene Booking");
					Scanner sw= new Scanner (System.in);
					char cd = sw.next().charAt(0);
					char p,o;
				
					switch (cd)
					{
				 		default :System.out.println("Please Choose valid method ");
				 				break;
				 		case 'p':
				 				BookingType b1= new BookingType();
				 				b1.acceptDetails();
				 				b1.displayDetails();
																 
				 		case 'o':
				 				BookingType b2= new BookingType();
				 				b2.acceptDetails();
				 				b2.displayDetails();
					}
				
				
			case 'z':
					System.out.println("Welcome to  OccenStar Hotel ");
					System.out.println("Which booking method you want used");
					System.out.println(" If you booked online you get 10% discount");
					System.out.println("l.online Booking "+"\n m.Offilene Booking");
					Scanner sr= new Scanner (System.in);
					char ce = sr.next().charAt(0);
					char i,u;
			
					switch (ce)
					{
			 			default :System.out.println("Please Choose valid method ");
			 					break;
			 			case 'i':
			 					BookingType b1= new BookingType();
			 					b1.acceptDetails();
			 					b1.displayDetails();
															 
			 			case 'u':
			 					BookingType b2= new BookingType();
			 					b2.acceptDetails();
			 					b2.displayDetails();
					}
			
		 }
			 	
		
	}
	
	public void bokingMumbai()
	{
		
	}
}
