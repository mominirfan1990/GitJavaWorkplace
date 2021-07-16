package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_11_Scalar_Matrix_Multiplication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter how many rows and coloum ");
		int q = sc.nextInt();
		int a[][]=new int[q][q];
		System.out.println(" Eneter Diagonal Element od Scalar matrix ");
		int w= sc.nextInt();
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				if(i==j)
				{
					a[i][j]=w;
				}
			}
		}
		System.out.println("\n Given Scalar Matrix is ");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Eneter which number you want to multiply with Scalar Matrix ");
		int t=sc.nextInt();
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(t*(a[i][j])+" ");
				
			}
			System.out.println();
		}

	}

}

