
package com.overloading;

import java.util.Scanner;
public class ticketBookingApp
{
	public static void main(String[] args)
	{
		TicketBooking b= new TicketBooking();
		
		movie mt= new movie();
		mt.name= "Tanhaji";
		mt.time= 16.45f;
		mt.seat="A-12";
		mt.theator= "Inox";
		b.ticketBooking(mt);
		
		
		air at = new air();
		at.name= "Irfan Momin";
		at.airline = "Indigo";
		at.from = "Pune";
		at.to = "Ahmedabad";
		at.seat= "A-45";
		at.time= 23.35;
		//b.ticketBooking(at);
		
	/*	train tt = new train();
		tt.name="Irfan Momin";
		tt.from="Pune";
		tt.to="Mumbai";
		tt.seat="D-72";
		tt.trainname="Deccan Quen";
		tt.trainNo= 7192456;
		tt.time=07.15;
		b.ticketBooking(tt);
	*/
	/*	
		
		train tt = new train();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to Online Ticket Booking ");
		System.out.println("Enter Train Name");
		tt.trainname=sc.next();
		System.out.println("Enter Tarin Number");
		tt.trainNo=sc.nextInt();
		System.out.println("Enter starting Station");
		tt.from=sc.next();
		System.out.println("Enter Destination  Station");
		tt.to=sc.next();
		System.out.println("Enter Departure Time");
		tt.time=sc.nextDouble();
		System.out.println("Enter Seat Number");
		tt.seat=sc.next();
		System.out.println("Enter Name of Passenger");
		tt.name=sc.next();
		b.ticketBooking(tt);
	*/
	}
	
}
