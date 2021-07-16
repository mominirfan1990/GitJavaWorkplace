package AssignmentonArray__of_Object;

import java.util.Scanner;

public class Employee_1 
{
	String name;
	int id, sal;
	String dnam;
	int did;
	Department d1;
	Employee_1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Employee  name");
		 name=sc.next();
		System.out.println("Eneter Employee Id");
		id = sc.nextInt();
		System.out.println("Eneter Employee Salary");
		sal= sc.nextInt();
		System.out.println("Eneter Depart Name");
		dnam=sc.next();
		System.out.println("Eneter Depart Id");
		did=sc.nextInt();
		d1= new Department(dnam,did);
	}
	public void display()
	{
		System.out.println(" Name of Empl ::"+name+ "\n Employee Eid ::"+id+"\n Empl Salary ::"+sal+d1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter How many Employee Details you want to enter");
		Employee_1 ep1[] = new Employee_1[sc.nextInt()];
		for(int i=0;i<ep1.length;i++)
		{
			ep1[i]=new Employee_1();
		}
		for(int i=0;i<ep1.length;i++)
		{
			ep1[i].display();
		}
		
		
	}
	
}
