package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_03_Substarction
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][],b[][],c[][];
		System.out.println("Eneter how many rows");
		int q = sc.nextInt();
		System.out.println("eneter how many coloums");
		int w= sc.nextInt();
		a=new int[q][w];b=new int[q][w];
		
		for(int i=0;i<a.length; i++) // for for 1st matrix 
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter 1st Martix  element "+i+" Row  "+j+" Colum "+" element");
				a[i][j]=sc.nextInt();
			}
		}
				
		for(int i=0;i<b.length; i++) // for for 2nd matrix
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print("Eneter 2nd MAtrix  element "+i+" Row  "+j+" Colum "+" element");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n 1st Matrix is ");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		for(int i=0;i<a.length; i++) // substarction loop
		{
			for(int j=0; j<a[i].length;j++)
			{
				a[i][j]=(a[i][j]-b[i][j]);
				
			}
			
		}
		
		
		
		System.out.println("\n 2nd Matrix is ");
		for(int i=0;i<b.length; i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("\n Substarction of 1st and 2nd Matrix is ");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}	
}
