// child class of Collage class
package inheritanceExample;


public class Student extends Collage
{
	int rollNo; String nam;
	 
	public void acceptDetails(String name, int rollNo)
	{
		this.rollNo = rollNo;
		nam= name;
	}
	
	 void displayDetails()
	{
		System.out.println("\n Student name ::"+ nam+"\n Student rollNumb ::"+rollNo);
		show();
	}
	
/*	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.acceptDetails("Irfan", 13);		
		s1.takeAdmiddion("Elecx", "AISSMS", "AI");
		s1.displayDetails();
	}
*/
}
