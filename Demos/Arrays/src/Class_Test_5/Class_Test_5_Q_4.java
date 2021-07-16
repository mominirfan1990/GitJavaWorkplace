package Class_Test_5;

import java.util.Scanner;

public class Class_Test_5_Q_4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Eneter matrix number of rows");
		int a=sc.nextInt();
		System.out.println("Eneter matrix number of rows");
		int b=sc.nextInt();
		int arr[][]= new int[a][b];
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(i%2==0 || i==0)
				{
					if( j%2!=0)
					{
						arr[i][j]=1;
					}
				}
				else if (i%2!=0)
					{
						if(j%2==0 || j==0)
						{
							arr[i][j]=1;
						}
					}
				
					
			}
		}
		for(int i=0; i<arr.length;i++)
		{ 
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
