package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_Exp_Left_UpperDiagonal
{
	
	Scanner sc = new Scanner(System.in);
	public void sumLower(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length-i;j++)
			{
				sum=sum +a[i][j];
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("Sum of Left upper daigonal is  "+sum);
		
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
		
		Two_D_Exp_Left_UpperDiagonal st =new Two_D_Exp_Left_UpperDiagonal();
		st.sumLower(a);
	}
}
