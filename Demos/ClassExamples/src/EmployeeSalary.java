
public class EmployeeSalary

{

	int salary,heighsalary;
	String name;
	
	public void acceptDetails(String a, int d)
	{
	
		name = a;
		salary = d;
	}
	
	public void show()
	{
		System.out.println("Name = "+ name);
		System.out.println("Salary = "+ salary);
	}
	
	public EmployeeSalary Heighest(BankAccount z2)
	{
		EmployeeSalary temp = new EmployeeSalary();
		temp.name= name;
		temp.salary = salary;
		return temp;
	}

}
