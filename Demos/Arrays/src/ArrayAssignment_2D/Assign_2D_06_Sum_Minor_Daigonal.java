package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_06_Sum_Minor_Daigonal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Number of rows ");
		int rw = sc.nextInt();
		System.out.println("Eneter Number of Coloums ");
		int cl = sc.nextInt();
		int arr[][]= new int[rw][cl];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			System.out.print("Eneter "+(i+1)+" Rows  "+(j+1)+" Coloms "+" Elemenet of 2D array ");
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given 2D Array is ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(arr.length-i-1);j>=(arr.length-1-i);j--)
			{
				  sum=(sum+arr[i][j]);
			}
		}	
		System.out.println("Addition or Sum of Minor Diagonal Element is :: "+sum);	

	}

}
