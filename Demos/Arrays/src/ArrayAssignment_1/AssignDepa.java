package ArrayAssignment_1;

import java.util.Arrays;
import java.util.Scanner;

class Studt
{
	int sid; String sname;
	public Studt()
	{
		
	}
	public Studt(int id,String name)
	{
		sid=id; sname=name;
	}
	public String toString()
	{
		String str;
		str= "\n Student name ::"+sname+"\n Student id ::"+sid;
		return str;
	}

}

class Departmt
{
	 int did; String dname;
	Studt std[]= new Studt[2];
	Departmt()
	{
		
	}
	Departmt( String nam, int id, Studt s[])
	{
	    did=id++; dname=nam;
		std=s;
		
	}

	public String toString()
	{
		String str= "\n Deapartment name :"+dname+"\nDepartment id :"+did+Arrays.toString(std);
		return str;
		
	}

}



public class AssignDepa 
{
	public static void main(String[] args)
	{
		Departmt dpt[]= new Departmt[5];
		Scanner sc = new Scanner(System.in);
		int did=1000, id=10;
		for(int i=0;i<dpt.length;i++)
		{
			System.out.println("Eneter"+ (i+1)+" department name");
			String n = sc.next();
		//	System.out.println("How many student details you want to eneter");
		//	int z=sc.nextInt();
			Studt st[] =new Studt[20];
			for(int j=0;j<st.length;j++)
			{
				st[j]=	new Studt();
				System.out.println("Enter"+ (j+1)+" Name of Student");
				st[j].sname =sc.next();
				st[j].sid=(id);
				id++;
			}
			id++;
			did++;
			dpt[i]= new Departmt(n,did, st);
		}
		for(int j=0;j<dpt.length;j++)
		{
		System.out.println(dpt[j]);
		}
	}
	
}
