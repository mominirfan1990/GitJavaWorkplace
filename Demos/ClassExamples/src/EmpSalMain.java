
public class EmpSalMain
{

	public static void main(String[] args)
	{
		EmployeeSalary p1 =new EmployeeSalary();
		p1.acceptDetails("irfan", 30000);
		EmployeeSalary p2 =new EmployeeSalary();
		p2.acceptDetails("shree", 20000);
		EmployeeSalary p3 =new EmployeeSalary();
		p3.acceptDetails("raj", 15000);
		EmployeeSalary p =new EmployeeSalary();
	
		
		p.salary = (p1.salary > p2.salary) ? (p1.salary >p3.salary)? p1.salary : p3.salary: (p2.salary>p3.salary)? p2.salary:p3.salary; 
		
		EmployeeSalary heigh = p;
		//heigh.show();
	
	}
	
	
}
