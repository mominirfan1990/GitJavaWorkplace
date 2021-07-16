package Assignment_On_Array;

import java.util.Scanner;

class AverageNum
{
	public void acceptNumber(int a[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element of  Array ");
			a[i]=sc.nextInt();
		} 
		System.out.println("\n Given array is  ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	public void findAverage(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("\n MAx is "+max);
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("\n min is "+min);
		
		float avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max && a[i]!=min)
			{
				avg=avg+a[i];
			}
		}
		avg=(avg/(a.length-2));
		System.out.println("\n Average of array excuding min and max is "+avg);
	}
}
public class Assign_11_Average_Expect_Min_Max 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter lenght of Array ");
	  int l= sc.nextInt();
	  int arr[]= new int[l];
	  
	  AverageNum an = new AverageNum();
	  an.acceptNumber(arr);
	  an.findAverage(arr);
	  
	}

}
