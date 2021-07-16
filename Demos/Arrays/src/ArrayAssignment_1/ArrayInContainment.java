package ArrayAssignment_1;

import java.util.Arrays;
import java.util.Scanner;

class Marks 
{
	int tm,pm,om;
	public Marks()
	{
		tm=pm=om=0;
	}
	public Marks(int x, int y, int z)
	{
		tm=x; pm=y; om=z;
	}
	public String toString()
	{
		String str;
		str= "\n Theory Marks "+tm+"\n Practicale Marks " +pm+ "\n Oral Mark " + om;
		return str;
	}

}

class Candidate1
{
	int roll; String name;
	Marks mks[]= new Marks[2];
	Candidate1()
	{
		
	}
	Candidate1( String n, int x, Marks m[])
	{
		roll=x; name=n;
		mks=m;
		
	}
	public void display()
	{
		System.out.println("Roll num ::"+roll);
		System.out.println("Name od Student ::"+name);
		//System.out.println("Marks of candidate ");
		for(Marks o:mks)
		{
			System.out.print(o);
			System.out.print(" ");
		}
	}

	public String toString()
	{
		String str= " \n Roll num "+roll+" \n Name "+name+ "\n Marks "+Arrays.toString(mks);
		return str;
		
	}

}

public class ArrayInContainment
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 Candidate1 cd1[]= new Candidate1[2];
	 int r=100;
	 for(int i=0;i<cd1.length;i++)
	 {
		 System.out.println("Eneter Student name ");
		 String n= sc.next();
		 r=(r+i);
		 Marks m[]=new Marks[2];
		 for(int j=0;j<m.length;j++)
			{
				m[j]=new Marks();
				System.out.println("Enter Practical Marks:");
				m[j].pm=sc.nextInt();
				System.out.println("Enter Theroy Marks:");
				m[j].tm=sc.nextInt();
				System.out.println("Enter Oral Marks:");
				m[j].om=sc.nextInt();
			}
			cd1[i]=new Candidate1(n,r,m);
	 }
	 for(int z=0;z<cd1.length;z++)
	 {
	System.out.println(cd1[z]);
	//  cd1[z].display();
	 // System.out.println("\n " );
	 }
	 }
}