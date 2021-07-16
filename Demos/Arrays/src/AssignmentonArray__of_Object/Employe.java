package AssignmentonArray__of_Object;

import java.util.Scanner;

public class Employe
{
	String name;
	int sal, id;
	
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter Name od Employee");
		name= sc.next();
		System.out.println("Please eneter Employee id ");
		id=sc.nextInt();
		System.out.println("Please eneter Salary of employee");
		sal=sc.nextInt();
	}
	public void displayDetails()
	{
		System.out.println("Employee Details are");
		System.out.println("Name is ::"+name+"\nEmp.Id is ::"+id+"\nSalary is :: "+sal);
	}
	
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please eneter how many employee details you want to enter");
	 Employe ep[]=new Employe[sc.nextInt()];
	 
	 for (int i=0; i<ep.length;i++)
	 {
		 ep[i]= new Employe();
		 ep[i].acceptDetails();
	 }
	 for(int i=0;i<ep.length;i++)
	 {
		 if(ep[i].sal>10000)
		 {
		 ep[i].displayDetails();
	 
		 }
	 }
		
	}

}
