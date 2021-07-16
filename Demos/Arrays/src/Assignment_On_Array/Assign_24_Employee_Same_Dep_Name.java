package Assignment_On_Array;

import java.util.Scanner;

class Department1
{
	int did;
	String dname;
	Department1()
	{}
	Department1(int id, String name)
	{
		did=id;
		dname=name;
	}
	public String toString()
	{
		String str="\n Department name : "+dname+"\n Department id : "+did+" \n";
		return str;
	}
}

class JoinDate
{
	int day,month,year;
	JoinDate()
	{}
	JoinDate(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public String toString()
	{
		String ss="\nJoining Date : "+day+"-"+month+"-"+year;
		return ss;
	}
}

class Employyes
{
	String ename;
	int eid,salary;
	JoinDate jd;
	Department1 dp;
	Employyes()
	{}
	Employyes(String name,int id, int sal,JoinDate jd,Department1 dp)
	{
		ename=name;
		eid=id;
		salary=sal;
		this.jd=jd;
		this.dp=dp;
	}
	public void displayDetails()
	{
		System.out.println("Employee name : "+ename+"\nEmployee Id : "+eid+"\nEMployee Salary : "+salary);
		System.out.print(jd);
		System.out.print(dp);
		System.out.println();
	}
	public void sameDept(Employyes ep[])
	{
		for(int i=0; i<ep.length; i++)
		{
			for(int j=(0+i); j<ep.length;j++)
			{
				if(i!=j && ep[i].dp.dname.equals(ep[j].dp.dname))
				{
					ep[i].displayDetails();
					ep[j].displayDetails();
				}
			}
		}
		
	}
}
public class Assign_24_Employee_Same_Dep_Name 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Eneter Number of Employees ");
		int num = sc.nextInt();
		Employyes e = new Employyes();
		Employyes emp[]=new Employyes[num];
		for(int i=0; i<emp.length; i++)
		{
			emp[i]=new Employyes();
			System.out.println("Eneter Employee Name ");
			emp[i].ename=sc.next();
			System.out.println("Enter Employee Id ");
			emp[i].eid=sc.nextInt();
			System.out.println("Enter Employee Salary ");
			emp[i].salary=sc.nextInt();
			
			emp[i].jd=new JoinDate();
			System.out.println("Enter Joining Day");
			emp[i].jd.day=sc.nextInt();
			System.out.println("Enter Joining Month");
			emp[i].jd.month=sc.nextInt();
			System.out.println("Enter Joining Year");
			emp[i].jd.year=sc.nextInt();
			
			emp[i].dp=new Department1();
			System.out.println("Enter Department NAme ");
			emp[i].dp.dname = sc.next();
			System.out.println("Enter Department Id ");
			emp[i].dp.did = sc.nextInt();
			
		}
		e.sameDept(emp);
		
	}
}
