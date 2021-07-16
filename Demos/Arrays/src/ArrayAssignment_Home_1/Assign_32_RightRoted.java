package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_32_RightRoted 
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
	System.out.println("given array is");
	for(int x:a)
	{
		System.out.print(x+"  ");
	}
	int temp=a[a.length-1];
/*	for(int i=0;i<a.length-1;i++)
	{
		a[a.length-1-i]=a[a.length-2-i];
			
	}
*/
	for(int i=a.length-1;i>0;i--)
	{
		a[i]=a[i-1];
	}
	
	a[0]=temp;
	System.out.println("\n final array after right shift rotation");
	for(int x:a)
	{
		System.out.print(x+"  ");
	}

}
}