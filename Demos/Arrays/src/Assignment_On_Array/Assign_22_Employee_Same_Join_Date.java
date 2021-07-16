package Assignment_On_Array;

import java.util.Scanner;

class Date
{
	int day, month, year;
	Date()
	{}
	Date(int d, int m, int y)
	{
		day=d; month=m; year=y;
	}
/*	public void displayDate()
	{
		System.out.println(day+"-"+month+"-"+year);
	}
*/	public String toString()
	{
		String str;
		str=day+"-"+month+"-"+year;
		return str;
	}
}

class Employee1
{
	String name;
	int id, salary;
	Date d;
	Employee1()
	{}
	Employee1(String name, int id, int sal, Date d)
	{
		this.name=name;
		this.id=id;
		salary= sal;
		this.d=d;
	}
	public void displayEmp()
	{
		System.out.println("Employee Name "+name+"\n Employee id "+id+"\n Employee Salary"+salary);
		System.out.println("Joining date "+d);
		System.out.println();
	}
	public void sameDate(Employee1 ep[])
	{
		for(int i=0; i<ep.length; i++)
		{
			for(int j=(0+i); j<ep.length;j++)
			{
				if(i!=j && ep[i].d.day==ep[j].d.day && ep[i].d.month==ep[j].d.month && ep[i].d.year==ep[j].d.year )
				{
					ep[i].displayEmp();
					ep[j].displayEmp();
				}
			}
							
		}
	}
	
}

public class Assign_22_Employee_Same_Join_Date
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("How many employee details you want to fill ");
		int l = sc.nextInt();
		Employee1 e1 = new Employee1();
		Employee1 ep []= new Employee1[l];
		for(int i=0; i<ep.length; i++)
		{
			ep[i]= new Employee1();
			
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Id");
			int id= sc.nextInt();
			System.out.println("Enter Employee Salary");
			int sal= sc.nextInt();
			
			System.out.println("Enter Day");
			int d=sc.nextInt();
			System.out.println("Enter Month");
			int m=sc.nextInt();
			System.out.println("Enter Year");
			int y=sc.nextInt();
			
			Date dt= new Date(d,m,y);	
			
			ep[i]= new Employee1(name,id,sal,dt);
			
		}
			
		e1.sameDate(ep);
		
	}
}



