

public class Hotel
{
	String hType,hName,hFacility,grade;
	int price;
	static String scheme;
	static
	{
		scheme = "Summer Offer 10% discount on Booking";
	}
	
	public void acceptDetailsHot(String name, String type, String facility,int price,String grade)
	{
		hType= type;  
		hName= name;
		hFacility = facility;
		this.price=price;
		this.grade=grade;
	}
	public void displayDetailsHot()
	{
		System.out.println("Name of Hotel  ::"+hName+ "\nHotel Type "+hType);
		System.out.println("Facility Avilable  ::"+hFacility+"\nHotel Grade  ::"+grade);
		System.out.println("Hotel Price ::"+price+"  per person per day");
		System.out.println(this.scheme);
		System.out.println("Enter Details for Booking");
		System.out.println();
	}
}
