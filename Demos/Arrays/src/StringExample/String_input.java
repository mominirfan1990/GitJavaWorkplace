package StringExample;

import java.util.Scanner;

public class String_input 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Supplier ID ");
		int id = sc.nextInt();
		
		System.out.println("Enter Supplier name ");
		String name = sc.next(); 
		
		System.out.println("Enter Supplier mob ");
		String mob = sc.next();
		
		 
		
		sc.close();
		System.out.println(" id  "+id+"\n NAme "+name+"\n Mob "+mob);
	}
	
}
