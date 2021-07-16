
public class Employee 
{
	int salary;
	String name;
	static int totalEmp, employee_id;
	static int count=0;
	
	static
	{
		totalEmp = 100;
		employee_id = 3000;
	}
	
	public Employee(String c,int b)
	{
		name = c;
		salary = b;
		count++;
	}
	
		
	public void displayDetails()
	{
		System.out.println("Employee ID   :: "+"S-"+ employee_id+count);
		System.out.println("Name of Employee  ::"+ name);
		System.out.println("Salary of Employee  ::"+ salary);
		System.out.println("Total Number of Employee ::"+ totalEmp+count);
	}
	
}
