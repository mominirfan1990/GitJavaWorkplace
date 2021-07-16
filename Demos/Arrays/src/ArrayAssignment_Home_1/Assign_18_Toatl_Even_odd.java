package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_18_Toatl_Even_odd 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int a[]= new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter element of array");
			a[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				//System.out.print("Even Number "+ a[i]+" ");
				count++;
			}
			else
			{
				//System.out.print("Odd Number "+ a[i]+" ");
			}
		}
		System.out.println("Total " + count + " Even Numbers ");
		System.out.println("Total "+ (a.length-count)+ " Odd numbers");
	}
}
