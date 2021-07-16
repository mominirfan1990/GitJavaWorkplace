package ArrayAssignment_2D;

import java.util.Scanner;

public class Two_D_exp1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][];
		System.out.println("Eneter how many rows");
		int q = sc.nextInt();
		System.out.println("eneter how many coloums");
		int w= sc.nextInt();
		a=new int[q][];
		System.out.println(a.length);
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print("Eneter array element "+i+" Row  "+j+" Colum "+" element");
				a[i][j]=sc.nextInt();
			}
		}
	
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}}; // for hard coded value initailized
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
