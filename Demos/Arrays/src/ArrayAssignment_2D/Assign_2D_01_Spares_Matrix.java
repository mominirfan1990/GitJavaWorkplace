package ArrayAssignment_2D;

import java.util.Scanner;

public class Assign_2D_01_Spares_Matrix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][];
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
	
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		int count=0,totalelement=0;
		for(int i=0;i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length;j++)
			{
				totalelement++;
				if((a[i][j])==0)
				{
					count++;
					
				}
			}
		}
		if((totalelement/2)<count)
		{
		System.out.println("Given Matrix is Sparse Matrix");
		}
		else
		{
			System.out.println("Given Matrix is Not Sparse Matrix");
		}
	}

}
