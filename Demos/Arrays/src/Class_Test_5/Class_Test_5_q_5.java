package Class_Test_5;

import java.util.Scanner;

public class Class_Test_5_q_5
{
	float sum=0; int count=0;
	Scanner sv = new Scanner(System.in);
	public void acceptDetails(int a[])
	{
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("eneter "+(i+1)+"element of array");
			a[i]=sv.nextInt();
		}
		for (int ds:a)
		{
			System.out.print(ds+" ");
		}
	
	}
	public void average(int a[])
	{
		System.out.println("\n Eneter starting range num for aveg");	
		int stnum=sv.nextInt();
		System.out.println("\n Eneter Ending range num for aveg");
		int ednum= sv.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>= stnum && a[i]<=ednum)
			{
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println(sum=(sum/count));
	}
	public static void main(String[] args)
	{
		Scanner sv = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int x= sv.nextInt();
		int a[]= new int[x];
		Class_Test_5_q_5 avp = new Class_Test_5_q_5();
		avp.acceptDetails(a);
		avp.average(a);
	}

}
