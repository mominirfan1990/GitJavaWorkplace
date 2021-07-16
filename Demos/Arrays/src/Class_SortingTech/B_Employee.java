// buble sort for soting employee their salary wise
package Class_SortingTech;

import java.util.Scanner;

public class B_Employee 
{
	
		String name;
		int id, sal;
			
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter Employee  name");
			name=sc.next();
			System.out.println("Eneter Employee Salary");
			sal= sc.nextInt();
		}
		public void display()
		{
			System.out.println(" Name of Empl ::"+name+"\n Empl Salary ::"+sal);
		}
		
		public void salSort(B_Employee a[])
		{
			for(int i=0; i<(a.length-1); i++)
			{
				
				for(int j=0; j<(a.length-1-i);j++)
				{
					if(a[j].sal>a[j+1].sal)
					{
						B_Employee temp= a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			
		}

		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please eneter How many Employee Details you want to enter");
			int x=sc.nextInt();
			B_Employee ep1[] = new B_Employee[x];
			for(int i=0;i<ep1.length;i++)
			{
				ep1[i]=new B_Employee();
				ep1[i].accept();
			}
			for(int i=0;i<ep1.length;i++)
			{
			 ep1[i].salSort(ep1);
			}
			for(int i=0;i<ep1.length;i++)
			{
				ep1[i].display();
			}
			
			
						
		}
		

		
		
}

