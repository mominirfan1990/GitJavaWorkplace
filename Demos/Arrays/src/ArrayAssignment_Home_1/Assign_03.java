package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_03 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter lenght of array  ");
		int val = sc.nextInt();
		int a[]= new int [val];
		for (int i=0; i<a.length;i++)
		{
			System.out.println("Please eneter element of array ::");
			a[i]= sc.nextInt();
			
		}
		System.out.println("Please eneter specific value you want to find out");
		int b = sc.nextInt();
		boolean flag = false;	
		int i;
		for ( i=0; i<a.length;i++)
		{
			if (a[i]==b)
			{
				flag=true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Specific value found :"+a[i]);
			System.out.println("index Value is :"+i);
		}
		else
			System.out.println("Specific value not found");
		
	}
}
