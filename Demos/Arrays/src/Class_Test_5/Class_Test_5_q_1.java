package Class_Test_5;

import java.util.Scanner;

public class Class_Test_5_q_1 
{
	public static void main(String[] srgs) 
	{
		int a []= {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		Scanner	sc= new Scanner(System.in);
		System.out.println("Please Eneter Character = ");
		String str= sc.next();
		
		
		char ch[]= str.toCharArray();
		for(char c:ch)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==c)
				{
					System.out.print(a[i]+" # ");
				}
			}
		}
		}
}
