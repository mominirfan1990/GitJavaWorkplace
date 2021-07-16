package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_16_Sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int a[]= new int [sc.nextInt()];
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter element of array");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of all array Element is "+sum);
	}
}
