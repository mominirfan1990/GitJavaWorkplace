package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_23_DuplicateNum {

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please eneter lenght of  array");
			int a[]=new int [sc.nextInt()];
			for(int i=0; i<a.length;i++)
			{
				System.out.println(" Eneter " + i + " Element of 1st array");
				a[i]=sc.nextInt();
			}
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				int temp=a[i];
				for(int j=i+1;j<a.length;j++)
				{
					if(temp==a[j])
					{
						count++;
					}
				}
			}
			System.out.println("\n " +count+" Duplicate verialbe in array");
			
		}

	}


