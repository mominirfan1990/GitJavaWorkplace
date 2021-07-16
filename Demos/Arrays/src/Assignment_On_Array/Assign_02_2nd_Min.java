package Assignment_On_Array;

import java.util.Scanner;

public class Assign_02_2nd_Min
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int a[]=new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter "+i+" element of array");
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<temp)
			{
				temp =a[i];
			}
		}
		int temp1=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(a[i]!=temp && a[i]<temp1)
			{
				temp1 =a[i];
			}
		}
		System.out.println("Second Minimum number is "+temp1);
	}
}
