package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_Exp_Searcg_By_method
{
	
	Scanner sc = new Scanner(System.in);
	public void searchNum(int a[][])
	{
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
		
		Two_D_Exp_Searcg_By_method st =new Two_D_Exp_Searcg_By_method();
		st.searchNum(a);
	}
}
