//Association with containment aggregation with construct method
public class Driver
{
	int age, licno;
	String name;
 
	Driver()
	{
		age = 24;
		licno = 3456;
		name = "Ramesha";
		System.out.println("defult constructor of Driver class");
	}
	
	Driver(int a,int b, String c)
	{

		age = a;
		licno = b;
		name = c;
	}
	
	public void TakeRTOExam()
	{
		System.out.println("Driver has passed RTO Exam");
	}
	
/*	public void displayDetails()
	{
	System.out.println("Dreiver dtailsa are  "+"\n age "+ age+ "\n licenece no "+licno+"\n name of driver  "+ name);	
	}
*/	
	public String toString()
	{
		String str;
		str="Dreiver dtailsa are  "+"\n age "+ age+ "\n licenece no "+licno+"\n name of driver  "+ name;	
		return str;
		
	}
	public static void main(String[] args)
	{
		Driver d1= new Driver();
		System.out.println(d1);
	}
}
