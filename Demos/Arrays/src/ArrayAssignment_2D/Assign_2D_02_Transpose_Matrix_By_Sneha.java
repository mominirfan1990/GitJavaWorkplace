package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_02_Transpose_Matrix_By_Sneha 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("How many rows u want to enter:");
		row=sc.nextInt();

		System.out.println("How many Colums u want to enter:");
		col=sc.nextInt();
		int a[][]=new int[row][col];
		int temp[][]=new int[col][row];
		System.out.println("Enter "+row*col+" Element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				temp[i][j]=a[j][i];
			}
		}
		
		
    	System.out.println("Your original array is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Transpose array is:");
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[i].length;j++)
			{
				System.out.print(temp[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
