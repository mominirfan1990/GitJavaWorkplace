package Class_Test_4;

import java.util.Scanner;

public class Class_Test_4_Q_10_ByUser 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter Lengh of Array");
	int a=sc.nextInt();
	int arr[]= new int[a];
	System.out.println("Eneter number in Array");
	arr[0]=sc.nextInt();
	int flag=0;int k=1;
	for(int i=1; i<arr.length;i++)
	{
		System.out.println("Eneter number in Array");
		int temp=sc.nextInt();
		for(int j=0;j<=i;j++)
		{	
			flag=0;
			if(arr[j]==temp)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		arr[k]=temp;
		k++;
		}
	}
	for(int i=0;i<k;i++)
	{			
		System.out.print(arr[i]+" ");
	}
	
	}
}
