package ArrayAssignment_1;

import java.util.Scanner;

public class SquareOfNumber 
{

	public void findsqr(int a[])
	{
		System.out.println();
		System.out.println("From give array square are:");
		for(int i=0;i<a.length;i++)
		{
			int sr=a[i]/2;
			for(int j=1;j<=sr;j++)
			{
				int sq=j*j;
				if(a[i]==sq)
				{
					//System.out.println(j+" and "+"-"+j+" is square root of:"+a[i]);
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int a[]= new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter element of array");
			a[i]=sc.nextInt();
			
		}
		System.out.println("given array is");
		for(int x:a)
		{
			System.out.print(x+"  ");
		}
		
		SquareOfNumber t=new SquareOfNumber();
		t.findsqr(a);
	}

}