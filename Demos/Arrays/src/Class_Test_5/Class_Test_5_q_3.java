package Class_Test_5;

import java.util.Arrays;
import java.util.Scanner;

public class Class_Test_5_q_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	// System.out.println("natural number");
    // int y= sc.nextInt();
		int a[]=new int [5];
/*		int x;
		for(int i=0; i<a.length;i++)
		{
			x=10*(i+1);
			a[i]=y+x;
			
		}
		for(int z:a)
		{
			System.out.print(z+" ");
		}
		*/
		for(int i=10,j=0; j<a.length;i++)
		{
			if(i%10==3)
			{
				a[j]=i;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
