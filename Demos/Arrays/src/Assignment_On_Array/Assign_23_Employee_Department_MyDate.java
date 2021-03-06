package Assignment_On_Array;

import java.util.Scanner;

class Department
{
  int did;
  String dname;
  Department()
  {}
  Department(int id, String nam)
  {
	  did=id;
	  dname=nam;
  }
  public String toString()
  {
	  String str="Department name : "+dname+"\n Department id : "+did;
	  return str;
  }
}

class MyDate
{
	int day, month, year;
	MyDate()
	{}
	MyDate(int d, int m, int y)
	{
		day=d; month=m; year=y;
	}
	public String toString()
	{
		String str;
		str=day+"-"+month+"-"+year;
		return str;
	}
}

class Employee2
{
	String name;
	int id, salary;
	MyDate d;
	Department dp;
	Employee2()
	{}
	Employee2(String name, int id, int sal, MyDate d, Department dp)
	{
		this.name=name;
		this.id=id;
		salary= sal;
		this.d=d;
		this.dp=dp;
	}
	public void displayEmp()
	{
		System.out.println("Employee Name : "+name+"\n Employee id : "+id+"\n Employee Salary : "+salary);
		System.out.println("Joining date : "+d);
		System.out.println(dp);
		System.out.println();
	}
	
}

public class Assign_23_Employee_Department_MyDate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("How many employee details you want to fill ");
		int l = sc.nextInt();
		Employee2 e1 = new Employee2();
		Employee2 ep []= new Employee2[l];
		for(int i=0; i<ep.length; i++)
		{
			ep[i]= new Employee2();
			
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
			
			System.out.println("Enter Department NAme ");
			String dnam = sc.next();
			System.out.println("Enter Department Id ");
			int did = sc.nextInt();
			
			Department dp = new Department(did,dnam);
			
			MyDate dt= new MyDate(d,m,y);	
			
			ep[i]= new Employee2(name,id,sal,dt,dp);
			
		}
		for(Employee2 s:ep)
		{
			s.displayEmp();
		}
		
	}
}

