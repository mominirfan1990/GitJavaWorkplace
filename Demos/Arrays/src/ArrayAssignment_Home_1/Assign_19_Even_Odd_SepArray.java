package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_19_Even_Odd_SepArray 
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
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int j=0,k=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c[j]=a[i];
				j++;
			}
			else
			{
				b[k]=a[i];
				k++;
			}
		}
		System.out.println("Even numbers");
		for(int x:c)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n Odds numbers");
		for(int y:b)
		{
			System.out.print(y+" ");
		}
	}
}


