package Assignment_On_Array;

import java.util.Scanner;

public class Assign_03_Print_Array_In_Reverse_Order
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int a[]=new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter "+i+" element of array");
			a[i]=sc.nextInt();
		}
		for(int j=a.length-1;j>=0;j--)
		{
				System.out.print(a[j]+" ");
			
		}
	}
}
