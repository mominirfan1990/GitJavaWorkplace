package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_Exp_Diagonal
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
				if(i==j)
				{
					a[i][j]=1;	
				}
				else
				{a[i][j]=0;}
				
			}
		}
	
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
