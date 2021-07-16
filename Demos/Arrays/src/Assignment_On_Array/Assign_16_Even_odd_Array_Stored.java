package Assignment_On_Array;

import java.util.Scanner;

public class Assign_16_Even_odd_Array_Stored
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
		System.out.println("\n Given Array");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		int b[]=new int[a.length];
		int j=0,k=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("\n Even Odd Sorted Array");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		}
}
