package Class_Test_6;

import java.util.Scanner;

class ArangNum
{
	Scanner sc = new Scanner(System.in);
	
	public void arrangeNum(int a[])
	{
		int temp[]= new int[a.length];
		int count=0;
		for(int i=0; i<temp.length; i++)
		{
			System.out.println("Eneter element of array ");
			temp[i]=sc.nextInt();
			if(temp[i]%3==0)
			{
				count++;
			}
		}
		int j=0;
		if(count>0)
		{
			for(int i=0; i<temp.length; i++)
			{
				if(temp[i]%3==0)
				{
					a[j]=temp[i];
					j++;
				}
				else 
				{
					a[count]=temp[i];
					count++;
				}
			}
			System.out.println("Arrange Array is ");
			for(int x:a)
			{
				System.out.print(x+" ");
			}
		}
		else
			System.out.println("No number Divisible by 3 in array");
	}
}
public class Q_5_Arrange_Divisible_by3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int lnght =  sc.nextInt();
		
		int a[]= new int[lnght];
		ArangNum arg = new ArangNum();
		arg.arrangeNum(a);
	}
}
