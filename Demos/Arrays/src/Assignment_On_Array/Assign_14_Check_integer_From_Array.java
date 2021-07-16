package Assignment_On_Array;

import java.util.Scanner;

public class Assign_14_Check_integer_From_Array {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int x= sc.nextInt();
		int arr[]= new int[x];
		int flag=0,flag1=0;
		for(int i=0; i<arr.length ;i++)
		{
			System.out.println(" Enter element of array ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length ;i++)
		{
			if(arr[i]==65)
				flag=1;
			else if(arr[i]==77)
				flag1=1;
		}
		if(flag==1)
			System.out.println("65 is present in given array");
		else
			System.out.println(" 65 is not present in given array ");
		if(flag1==1)
			System.out.println("77 is present in given array ");
		else
			System.out.println(" 77 is not present in given array ");
	}

}
