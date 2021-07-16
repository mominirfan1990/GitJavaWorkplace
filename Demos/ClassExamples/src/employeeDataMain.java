
public class employeeDataMain
{

	public static void main(String [] args)
	{
		employeeData e1,e2;
		e1=new employeeData();
		e2=new employeeData();	
		
		e1.acceptDetails();
		e2.acceptDetails();
		
		e1.grossSalary();
		e1.displayDetails();
		e1.designationOfEmployee();
		
		e2.grossSalary();
		e2.displayDetails();
		e2.designationOfEmployee();
		
	}
}
