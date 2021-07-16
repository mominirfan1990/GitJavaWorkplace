package AssignmentonArray__of_Object;

import java.util.Scanner;

public class Employee 
{
		String  name,designation;
		int basic,hra,da,id;
		double gross;
		Employee(String nm, int bs, int eid)
		{
			name=nm;
			basic=bs;
			id=eid;
		}
		public void grossSalary()
		{
			if (basic >=50000)
			{
				gross= (basic+ (basic*0.20) + (basic*0.35));
			}
			else if (basic >=30000 && basic <50000)
			{
				gross= (basic+ (basic*0.15) + (basic*0.30));
			}
			else if (basic >= 10000 && basic < 30000)
			{
				gross= (basic+ (basic*0.10) + (basic*0.25));
			}
			else
			{
				gross = basic;
			}
		}
		
		public void displayDetails()
		{
			System.out.println("name  " +name);
			System.out.println("Employee Id " + id);
			System.out.println("Gross salary = " + gross);
		}

	public static void main(String [] args)
	{
		Employee e[]= new Employee [4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter employee details");
		for(int j=0; j<e.length; j++)
		{
			System.out.println("Eneter name");
			String nam = sc.next();
			System.out.println("eneter basic salary");
			int sal = sc.nextInt();
			System.out.println("eneter Eid");
			int eid= sc.nextInt();
			e[j]= new Employee( nam, sal, eid);
		}
		for (int i=0 ; i<e.length; i++)
		 {
			e[i].grossSalary();
			if( e[i].gross>50000)
			{
				e[i].displayDetails();
 			}
		 }
	}
}
