package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_02_Transpose_Matrix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][];
		System.out.println("Eneter how many rows");
		int q = sc.nextInt();
		System.out.println("eneter how many coloums");
		int w= sc.nextInt();
		a=new int[q][w]; int b[][]=new int[w][q];
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter array element "+i+" Row  "+j+" Colum "+" element");
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
		for(int i=0;i<b.length; i++)  // for transverse matrix 
		{
			for(int j=0; j<a.length;j++)
			{
				b[i][j]=a[j][i];
				
			}
			
		}
		System.out.println("\n Transverse Matrix is");
		for(int i=0;i<b.length; i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
}
}
