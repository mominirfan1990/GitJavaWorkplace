import java.util.Scanner;

public class Student 
{

	String name;
	int rollNum,physicsMarks,chemistryMarks,mathsMarks,total;
	float percentage;
	
	public void acceptDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Name of Student ");
		name=sc.nextLine();
		
		System.out.println("Please Enter Roll Number of Student ");
		rollNum=sc.nextInt();
		
		System.out.println("Please Enter Physics marks of Student ");
		physicsMarks=sc.nextInt();
		
		System.out.println("Please Enter Chemistry Marks  of Student ");
		chemistryMarks=sc.nextInt();
		
		System.out.println("Please Enter Maths Marks  of Student ");
		mathsMarks=sc.nextInt();
	
	}
	
	public void displayDetails()
	{
		
		System.out.println("name" + name );
		System.out.println("Physics marks = "+ physicsMarks);
		System.out.println("Chemistry marks = " + chemistryMarks);
		System.out.println("maths marks = " + mathsMarks);
		System.out.println("Percentage =" + percentage + "%");
		System.out.println("Total marks = "+ total);
	}
	
	public void calculatePercentage()
	{
		percentage  = (float) (mathsMarks + physicsMarks + chemistryMarks)/3 ;
	}
	
	public void totalMarks()
	{
		total= (mathsMarks + physicsMarks + chemistryMarks);
	}
	
	public void showResult()
	{
		if(percentage>=75 )
		{
			System.out.println("Distingshion class");
		}
		else if (percentage >=60 && percentage < 75)
		{
			System.out.println("First Class");
		}
		else if (percentage >=45 && percentage <60)
		{
			System.out.println("Second Class");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	 
}

