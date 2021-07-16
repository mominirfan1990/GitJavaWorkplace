package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_exp2_Search_elemet 
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
		System.out.println("which Number you want to search");
		int no=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				if(no == (a[i][j]))
				{
					count++;
					System.out.println("Number "+no+" Number is availbele "+count+" ");
				}
			}
		}
		
		
	}

}
