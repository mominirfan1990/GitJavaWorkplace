package Assignment_On_Array;

import java.util.Scanner;

public class Assign_04_Reverse_Array_Using_Temp_Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int a[]=new int [sc.nextInt()];
		int temp[]=new int[a.length];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter "+i+" element of array");
			a[i]=sc.nextInt();
			temp[i]=a[i];
		}
		sc.close();
		for(int i=0;i<a.length;i++)
		{
			a[i]=temp[a.length-1-i];
			System.out.print(a[i]+" ");
		}
		
	}

}
