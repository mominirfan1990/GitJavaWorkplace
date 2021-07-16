import java.util.Scanner;

public class employeeData
{

	String  name,designation;
	int basic,hra,da,id;
	double gross;
	
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Eneter Name Of Employee");
		name = sc.nextLine();
		
		System.out.print("Please Eneter iD Of Employee");
		id = sc.nextInt();
		
		System.out.print("Please Eneter Basic salary Of Employee");
		basic = sc.nextInt();
				
	}
	
	public void grossSalary()
	{
		if (basic >=50000)
		{
			gross= (basic+ (basic*0.20) + (basic*0.35));
		}
		else if (basic >=30000 && basic <50000)
		{
			gross= (basic+ (basic*0.15) + (basic*0.30));
		}
		else if (basic >= 10000 && basic < 30000)
		{
			gross= (basic+ (basic*0.10) + (basic*0.25));
		}
		else
		{
			gross = basic;
			
		}
	}
	
	public void designationOfEmployee()
	{
		if (gross > 60000)
		{
			
			System.out.println ("Employee Designation is = Vice Precident");
			
		}
		else if(gross >40000 && gross <= 60000)
		{
			System.out.println("Employee Designation is = Maneger ");
		}
		else if(gross >30000 && gross <= 40000)
		{
			System.out.println("Employee Designation is = Assistant Maneger ");
		}
		else if( gross >20000 && gross<=30000)
		{
			System.out.println("Employee Designation is = Engineer " );
		}
		else if(gross > 10000 && gross <=20000)
		{
			System.out.println("Employee Designation is = Cleark ");
		}
		else
		{
			System.out.println("Employee Designation is = Peon");
		}
	}
	public void displayDetails()
	{
		System.out.println("name  " +name);
		System.out.println("Employee Id " + id);
		System.out.println("Gross salary = " + gross);
		
	}
	
}


