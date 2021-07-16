import java.util.Scanner;
public class EmployeeApp 
{
 
	public static void main(String[] args)
	{
		char ans= 'y';
		int no=0;
		
		while (ans=='y'|| ans== 'Y')
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee PayRoll App");
		System.out.println();
		System.out.println("Do you want to Enter New Employee Details (y/n)");
		ans= sc.next().charAt(0);
		System.out.println("Enter Employee Name ::");
		String name=sc.next();
		System.out.println("Enter Employee Salary ::");
		int salary = sc.nextInt();
		Employee e1= new Employee(name,salary);
		e1.displayDetails();
		}
		
			
	}
}
