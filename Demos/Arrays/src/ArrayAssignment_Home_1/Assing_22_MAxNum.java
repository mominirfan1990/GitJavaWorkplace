package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assing_22_MAxNum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter lenght of array");
			int a[]=new int [sc.nextInt()];
			for(int i=0; i<a.length;i++)
			{
				System.out.println("Enter "+i+" element of array");
				a[i]=sc.nextInt();
			}
			int temp=a[0];
			for(int i=1; i<a.length;i++)
			{
				if(a[i]>temp)
				{
					temp =a[i];
				}
			}
			System.out.println("\n largest number is "+temp );
		}


	}


