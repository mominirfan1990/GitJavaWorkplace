
import java.util.Scanner;
public class payRoll


{

	public static void main(String[] args)
	{
		
		 int  salary;
		 Scanner sc;
		 sc=new Scanner(System.in);
		 System.out.println("Please Enter Salary Of Employee =" );
		 salary= sc.nextInt();
		
		 if (salary >= 10000)
		 {
		  if(salary >= 10000 && salary<=20000)
			 
			  System.out.println("Employee Designation is AM" );
			 
			 else if(salary >20000 && salary <=40000)
			 
			    	 System.out.println("Employee Designation is DM=" );
			 else if (salary > 40000)
			 System.out.println("Employee Designationis VP" );

			     

			 
				 
		 }
		 else
			 System.out.println("Please Enter valid Salary Of Employee =" );

	}
}