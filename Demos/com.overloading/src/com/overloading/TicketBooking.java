package com.overloading;

class movie
{
	float time;
	String name,theator, seat;
	
	public void display()
	{
		System.out.println("   ! Welcome to  "+ theator +"   Word of Entertenment !  ");
		System.out.println();
		System.out.println("Movie Name             :" + name);
		System.out.println("Time of Movies         :" + time);
		System.out.println("Your Booked Seats No   :"+ seat);
		System.out.println();
		System.out.println("       !! Enjoy Your Movie !!   ");
	}
}

class air
{
	String seat;
	double time;
	String name, from , to,airline;
	 public void display()
	 {
		 System.out.println("   Welcome to  " + airline +"  Airlines ");
		 System.out.println();
		 System.out.println("Passenger Name   : " + name);
		 System.out.println("Your Jurney From : " + from + "  To  " + to);
		 System.out.println("Seat Number      :"+ seat);
		 System.out.println("Departure Time   :" + time);
		 System.out.println();
		 System.out.println("  !!!     Wish You Happy Jurney   !!! ");
	 }
	
}

class train
{
	int trainNo;
	double time;
	String name,seat, from , to, trainname;
	 public void display()
	 {
		 System.out.println("                 Welcome to Indian Railway ");
		 System.out.println();
		 System.out.println("Train Name       :  " + trainname + "    Train Number  : " + trainNo);
		 System.out.println("Your Jurney From :  " + from + "    To     " + to);
		 System.out.println("Departure Time   :  " + time + "       Seat Number :  "+ seat);
		 System.out.println("Passenger Name   :  "+  name);
		 System.out.println();
		 System.out.println("           !!  Wish You Happy Jurney  !!");
	 }
	
	
}



public class TicketBooking
{
  public void ticketBooking(movie m)
  {
	  System.out.println();
	  m.display();
  }
  public void ticketBooking(air a)
  {
	  System.out.println();
	  a.display();
  }
  public void ticketBooking(train t)
  {
	  System.out.println();
	  t.display();
  }
		
}
