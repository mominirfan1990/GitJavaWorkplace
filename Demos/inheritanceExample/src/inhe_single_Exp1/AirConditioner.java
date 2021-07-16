// child class of cooler class
package inhe_single_Exp1;

public class AirConditioner extends Cooler
{

	int capacity,price;
	String model;
	
/*	public void details(int cap, String mod)
	{
		capacity = cap;
		model = mod;
	}
*/
	public AirConditioner()
	{
		//this(12000);
		//super (); //super write to call parent class default constructor
		capacity= 1;
		model = "S-Freez";
		System.out.println("Child class Defualt constructor");
		//System.out.println(("hashcode of childdefualt construc "+this.hashCode()));
	}
	public AirConditioner(int z)
	{
		//super (); // super write to call parent class parameterized constructor
		price = z;
		System.out.println("child class paremeterised constructor");
	}
	public void display()
	{
		System.out.println("AirConditioner have "+capacity +" Tone Capacity"+"\n  Model name is  ::"+model+" price "+price);
	    this.show();
	}
	
	
	public static void main(String[] args)
	{
		//AirConditioner ac = new AirConditioner(12000); // object created and called parameterized constructor of child class
		AirConditioner ac = new AirConditioner();	   // object created and called default constructor of child class
		//ac.acceptDetails("Air Cool", "  Domestic ");
		//ac.details(1, "  S-Freez ");
		// System.out.println(ac);  // called by to string method
		ac.display();
		
		
		
		
	}
}
