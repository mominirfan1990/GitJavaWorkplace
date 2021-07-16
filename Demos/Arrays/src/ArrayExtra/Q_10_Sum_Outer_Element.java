package ArrayExtra;

import java.util.Scanner;

public class Q_10_Sum_Outer_Element 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][];
		System.out.println("Eneter how many rows in matrix ");
		int q=sc.nextInt();
		System.out.println("Eneter how many coloum in matrix ");
		int w = sc.nextInt();
		a=new int[q][w];
		
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
		int sum=0;
		for(int i=0;i<q; i++)
		{
			if(i==0|| i==q-1)
			{
				for(int j=0; j<w;j++)
				{
					sum=sum+a[i][j];
					System.out.print(a[i][j]+" ");
				}
			}
			else if (i!=0 && i!=q-1)
			{
				for(int j=0;j<w;j++)
				{
					if(j==0 || j==w-1)
					{
						sum=sum+a[i][j];
						System.out.print(a[i][j]+" ");
					}
				}
			}
		
		}
		System.out.println("Outer element Sum is "+ sum);
	}
}
