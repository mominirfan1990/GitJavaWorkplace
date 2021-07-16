//Association with containment aggregation with construct method
public class EmployeApp
{
	public static void main(String[] atgs)
	{
		MyDate d1 = new MyDate(21,03,2020);
		Employe e1= new Employe();
		e1.display();
		
		System.out.println();
		Employe e2 = new Employe(101, "Ramesh", d1, new MyDate(21,03,2021)); 
		e2.display();
		
	}
}
