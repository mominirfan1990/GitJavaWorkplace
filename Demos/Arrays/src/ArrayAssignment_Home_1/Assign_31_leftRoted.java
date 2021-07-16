package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_31_leftRoted {

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
		System.out.println("given array is");
		for(int x:a)
		{
			System.out.print(x+"  ");
		}
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			System.out.println("\n "+(i+1)+" Left shift");
			for(int q:a)
			{
				System.out.print(q+"  ");
			}
				
		}
		a[a.length-1]=temp;
		System.out.println("\n final array after Left shift");
		for(int x:a)
		{
			System.out.print(x+"  ");
		}
	}

}
