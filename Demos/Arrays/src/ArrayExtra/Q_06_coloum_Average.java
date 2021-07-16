package ArrayExtra;

import java.util.Scanner;

public class Q_06_coloum_Average
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][],b[][],c[][];
		System.out.println("Eneter how many rows and columb in matrix ");
		int q = sc.nextInt();
		a=new int[q][q];
		
		for(int i=0;i<a.length; i++) // for for 1st matrix 
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter Martix  element "+(i+1)+" Row  "+(j+1)+" Colum "+" element");
				a[i][j]=sc.nextInt();
			}
		}
				
		System.out.println("\n Given Matrix is ");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		float cavg;
		for(int j=0;j<a.length;j++)
		{
			cavg=0;
			for(int i=0;i<a.length; i++)
			{
				cavg=(cavg+a[i][j]);
				
			}
			System.out.println("\n Average of  "+ (j+1)+"  coloum is  "+(cavg/q));
		}
	}

}
