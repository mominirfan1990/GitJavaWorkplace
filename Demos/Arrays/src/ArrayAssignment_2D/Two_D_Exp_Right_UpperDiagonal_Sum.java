package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_Exp_Right_UpperDiagonal_Sum // right upper diagonal addition
{		
		Scanner sc = new Scanner(System.in);
		public void sumLower(int a[][])
		{
			int sum=0;
			for(int i=0;i<a.length; i++)
			{
				for(int j=i; j<a.length;j++)
				{
					sum=sum +a[i][j];
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println("Sum of Right  Upper daigonal is  "+sum);
			
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
			
			Two_D_Exp_Right_UpperDiagonal_Sum st =new Two_D_Exp_Right_UpperDiagonal_Sum();
			st.sumLower(a);
		}
}
