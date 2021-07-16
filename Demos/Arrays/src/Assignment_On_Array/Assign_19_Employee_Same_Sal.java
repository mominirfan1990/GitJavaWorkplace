package Assignment_On_Array;

import java.util.Scanner;

class Employee
{
	String name;
	int id, salary;
	Employee()
	{}
	Employee(String name, int id, int sal)
	{
		this.name=name;
		this.id=id;
		salary= sal;
	}
	public void sameSal(Employee ep[])
	{
		
		for(int i=0; i<ep.length; i++)
		{
			for(int j=(i+1); j<ep.length;j++)
			{
				if(ep[j].salary==ep[i].salary && j!=i)
				{
					System.out.println("Name "+ep[j].name+"\n Id "+ep[j].id+"\n Salary "+ep[j].salary);
					System.out.println("Name "+ep[i].name+"\n Id "+ep[i].id+"\n Salary "+ep[i].salary);
				
				}
			}
		}
	}
}

public class Assign_19_Employee_Same_Sal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("How many employee details you want to fill ");
		int l = sc.nextInt();
		Employee ep []= new Employee[l];
		for(int i=0; i<ep.length; i++)
		{
			ep[i]= new Employee();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Id");
			int id= sc.nextInt();
			System.out.println("Enter Employee Salary");
			int sal= sc.nextInt();
			ep[i]= new Employee(name,id,sal);
	
		}
		Employee e = new Employee();
		e.sameSal(ep);
		
	}
}
