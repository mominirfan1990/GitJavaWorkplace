package Assignment_On_Array;

import java.util.Scanner;

public class Assign_20_Array_Of_Table {

	public static void main(String[] args)
	{
		int arr[]=new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Number which table you want");
		int a= sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=((i+1)*a);
		}
		System.out.println("Table of "+a+" is ");
		for(int x:arr)
		{
			System.out.println(x);
		}
	}

}
