package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_08_Print_Upper_Traingle 
{
	public static void main(String[] args)
	{
		int a[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter how many rows");
		int q = sc.nextInt();
		System.out.println("eneter how many coloums");
		int w= sc.nextInt();
		a=new int[q][w];
		System.out.println(a.length);
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter array element "+i+" Row  "+j+" Colum "+" element");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(" Given 2D array ");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Upper Traingle element are");
		for(int i=0;i<a.length; i++)
		{
			for(int j=i; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			
		}
		
	}



}
