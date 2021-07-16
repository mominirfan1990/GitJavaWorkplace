package Class_Test_5;


import java.util.Scanner;

 class Person
{
	String name; int age;
	int adharNo;
	Scanner sc = new Scanner(System.in);
	public void acceptDetails()
	{
		 System.out.println("Eneter Name ");
		 name =sc.next();
		 System.out.println("Enter Age");
		 age = sc.nextInt();
		 System.out.println("Adhar Number");
		 adharNo = sc.nextInt();
		
	}
	public void displayDetails()
	{
		System.out.println("Name ::"+name);
		System.out.println("Age ::"+age);
		System.out.println("Adhar Number is"+adharNo);
		System.out.println();
		
	}
	public void adharSort(Person p[])
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=0; j<p.length-1-i;j++)
			{
				if(p[j].adharNo>p[j+1].adharNo)
				{
					Person temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}
			}
		}
		
	}
	public void nameSort(Person p[])
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=0; j<p.length-1-i;j++)
			{
				if(p[j].name.charAt(0)>p[j+1].name.charAt(0))
				{
					Person temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}
			}
		}
		
	}
}
 
 public class CLass_Test_5_q_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Person p[] = new Person[3];
		 for(int i=0;i<p.length;i++)
		 {
			 p[i]=new Person();
			 p[i].acceptDetails();
			 p[i].displayDetails();
		 }
		 Person t = new Person();
		 t.adharSort(p);
		 for(int i=0;i<p.length;i++)
		 {
			 p[i].displayDetails();
		 }
		
		 t.nameSort(p);
		 System.out.println();
		 for(int i=0;i<p.length;i++)
		 {
			 p[i].displayDetails();
		 }
		
	}
	
}