//Association with containment aggregation with construct method
public class Student 
{

	int roll;
	String name;
	Department d1;
	
	Student()
	{
		roll = 34;
		name = "Shree";
	}
	
	Student(int x, String y, Department d1)
	{
		roll = x;
		name = y;
		this.d1=d1;
	}
	
	public void displayDitails()
	{
		System.out.println("Student Details ::"+"\n Student Roll number ::"+roll+ "\n Student name ::"+name+ "\n"+d1);
	}
	

	public static void main(String[] args)
	{

	
		Department d1 = new Department();
		Student s1 = new Student(12,"Ram",d1);
		s1.displayDitails();
	}
	
}


