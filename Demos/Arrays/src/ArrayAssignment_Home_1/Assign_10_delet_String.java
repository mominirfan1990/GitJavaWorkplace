package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_10_delet_String
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter lenght of array");
		String a[]= new String[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please Enter "+(i+1)+" Element of array");
			a[i]=sc.next();
		}
		for(String w:a)
		{
			System.out.print(w+" ");
		}
		System.out.println("Please eneter which Position element you want to delet");
		int d=sc.nextInt();
		for(int j=(d-1); j<(a.length-1); j++)
		{
			a[j]=a[j+1];
		}
		a[a.length-1]=" ";
		for(String x:a)
		{
			System.out.print(x+" ");
		}
	}

}
