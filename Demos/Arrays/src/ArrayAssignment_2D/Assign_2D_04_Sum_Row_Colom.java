package ArrayAssignment_2D;

import java.util.Scanner;


class averagef
{
	public void calculateAVeg(int a[][])
	{
	System.out.println("\n Given Matrix is "); // Print given matrix
	for(int i=0;i<a.length; i++)
	{
		for(int j=0; j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	float rsum,csum;
	for(int i=0;i<a.length; i++)
	{	
		rsum=0;
		for(int j=0; j<a[i].length;j++)
		{
			rsum=(rsum+a[i][j]);
			
		}
		System.out.println("\n sum of  "+ (i+1) +"  row is  "+(rsum/(a.length+1))
				);
		
	}
	for(int j=0;j<a.length+1;j++)
	{
		csum=0;
		for(int i=0;i<a.length; i++)
		{
			csum=(csum+a[i][j]);
			
		}
		System.out.println("\n sum of  "+ (j+1)+"  coloum is  "+(csum/a.length));
	}
	}
}
public class Assign_2D_04_Sum_Row_Colom
{
	public static void main(String[] args)
	{
	/*	Scanner sc = new Scanner(System.in);
		int a[][],b[][],c[][];
		System.out.println("Eneter how many rows");
		int q = sc.nextInt();
		System.out.println("eneter how many coloums");
		int w= sc.nextInt();
		a=new int[q][w];
	*/
		int a[][]= {{1,2,3,7},{4,5,6,8},{9,7,8,5}};
		averagef av= new averagef();
		av.calculateAVeg(a);
	/*	for(int i=0;i<a.length; i++) // for loop for input from user 
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter 1st Martix  element "+i+" Row  "+j+" Colum "+" element");
				a[i][j]=sc.nextInt();
			}
		}
		*/		
		}
}
