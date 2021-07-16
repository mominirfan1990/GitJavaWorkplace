package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_06 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter lenght of array  ");
		int val = sc.nextInt();
		int a[]= new int [val];
		int b[]= new int [a.length];
		for (int i=0; i<a.length;i++)
		{
			System.out.println("Please eneter "+ i +" element of array ::");
			a[i]= sc.nextInt();
					
		}
		for (int x : a)
		{
			System.out.print(x+" ");
		}
		System.out.println(" Array elements in reverse  ::");
		for (int i=a.length-1; i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
