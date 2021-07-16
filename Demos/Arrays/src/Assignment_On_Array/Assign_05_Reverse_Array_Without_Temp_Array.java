package Assignment_On_Array;

import java.util.Scanner;

public class Assign_05_Reverse_Array_Without_Temp_Array 
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
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<(a.length/2))
			{
				temp=a[i];
				a[i]=a[(a.length-1-i)];
				a[(a.length-1-i)]=temp;
			}
			System.out.print(a[i]+" ");
		}

	}

}
