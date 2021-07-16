
class BoxOffice
{
	String movieName;
	int ticketSold;
	static int ticketAvaialable;
	BoxOffice()
	{}
	BoxOffice(String movieName,int ts,int ta)
	{
		this.movieName=movieName;
		ticketSold=ts;
		ticketAvaialable=ta;
	}
	public synchronized void bookTicket(String mname,int noOfSeat)
	{
		System.out.println(" Movie Name '"+movieName+"' "+" Available seats "+ticketAvaialable);
		if(ticketAvaialable>0)
		{
			if(ticketAvaialable>=noOfSeat && movieName.equals(mname))
			{
				System.out.println("Ticket Booking done ");
			
				ticketAvaialable=ticketAvaialable-noOfSeat;
				ticketSold=ticketSold+noOfSeat;
			}
			else
			{
				System.out.println("Booking not done Only "+ticketAvaialable+" seats available");
			}
		}
		else
		{
			System.out.println("All Tickets are sold ");
		}
	}
}
class Custmer extends Thread
{
	BoxOffice o;
	Custmer(BoxOffice o)
	{
		this.o=o;
	}
	public void run()
	{
		o.bookTicket("SHOLEY", 6);
	}

}
public class VideoAssignt_03_04_05 {

	public static void main(String[] args)
	{
		BoxOffice b= new BoxOffice("SHOLEY",30,6);
		
		Custmer t1=  new Custmer(b);
		t1.start();
		try
		{
			t1.join();
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Custmer t2= new Custmer(b);
		t2.start();
	}

}
