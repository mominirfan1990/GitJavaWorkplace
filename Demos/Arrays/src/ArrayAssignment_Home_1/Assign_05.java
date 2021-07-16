package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assign_05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter lenght of array  ");
		int val = sc.nextInt();
		int a[]= new int [val];
		int b[]= new int [a.length];
		for (int i=0; i<a.length;i++)
		{
			System.out.println("Please eneter "+ i +" element of array ::");
			a[i]= sc.nextInt();
						
		}
/*		for (int i=0; i<a.length;i++)
		{
			b[i]=a[i];
		}
*/		int i=0;
		for(int x:a)
		{
			b[i]=x;
			i++;
			
		}
		for (i=0; i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}
}
