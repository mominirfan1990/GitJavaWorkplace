package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_24_unique {

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please eneter lenght of  array");
			int a[]=new int [sc.nextInt()];
			for(int i=0; i<a.length;i++)
			{
				System.out.println(" Eneter " + i + " Element of  array");
				a[i]=sc.nextInt();
			}
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			int count=0;
			int flag=0; int k=0;
			int b[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				int temp=a[i];
				flag=0;
				for(int j=0;j<a.length;j++)
				{
					if(temp==a[j]&& j!=i)
					{
						flag=1;
					}
				}
				
				if(flag!=1)
				{
					
					b[k]=a[i];
					k++;
					count++;
				}
			}
			System.out.println("\n Unique number in array is ::");
			for(int h=0; h<count;h++)
			{
				System.out.print(b[h]+" ");
			}
			
		}

	}


