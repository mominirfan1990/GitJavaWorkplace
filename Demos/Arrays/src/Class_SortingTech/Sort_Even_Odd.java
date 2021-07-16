package Class_SortingTech;

import java.util.Scanner;

public class Sort_Even_Odd 
{
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
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int j=0,k=0,ecount=0,ocount=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)    // for find even number
			{
				c[j]=a[i];
				j++;
				ecount++;
			}
			else       // for odd number
			{
				b[k]=a[i];
				k++;
				ocount++;
			}
		}
		System.out.println("Even numbers");
		for(int i=0;i<ecount;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		System.out.println("\n Odds numbers");
		for(int i=0;i<ocount;i++)
		{
			System.out.print(b[i]+" ");
		}
		// for even sorted logic 
		for (int i= 0; i<(c.length-1); i++)
		{
			int min=i;
			for( j=i+1; j<c.length; j++ )
			{
				if(c[j]>c[min])
				{
					min=j;
				}
			}
			if(c[i]<c[min])
			{
				int d = c[i];
				c[i]=c[min];
				c[min]=d;
			}
		}
		System.out.println("\n Sorted even");
		for(int i=0;i<ecount;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		// for odd sorted object
		for (int i= 0; i<(b.length-1); i++)
		{
			int min=i;
			for( j=i+1; j<b.length; j++ )
			{
				if(b[j]>b[min])
				{
					min=j;
				}
			}
			if(b[i]<b[min])
			{
				int d = b[i];
				b[i]=b[min];
				b[min]=d;
			}
		}
		System.out.println("\n Sorted odd");
		for(int i=0;i<ocount;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}
