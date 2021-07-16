package ArrayAssignment_1;

import java.util.Scanner;

public class Supplier_obj
{
	String name, mob;
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter name");
		name = sc.next();
		System.out.println("Eneter mob num");
		mob = sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Name of Supplier is  " + name + "\n Mobile number  " + mob);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Supplier Details You want to Eneter");
		Supplier_obj sp[] = new Supplier_obj[sc.nextInt()];

		for (int i = 0; i < sp.length; i++) 
		{
			sp[i] = new Supplier_obj();
			sp[i].acceptDetails();
		}
		System.out.println("Eneter Supplier name you want to see");
		String nam= sc.next();
		for (int i = 0; i < sp.length; i++)
		{
			if(sp[i].name.equals(nam))
			{
			sp[i].displayDetails();
			}
		}
	}

}
