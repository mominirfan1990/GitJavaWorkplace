package ArrayAssignment_For_Each_Loop;

import java.util.Scanner;

public class A_04_Average_Except {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter lenght of array ");
		int l= sc.nextInt();
		int arr[]=new int[l];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter Array element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Eneter Number which dont include in average");
		int num=sc.nextInt();
		float avg=0;
		for(int y:arr)
		{
			if(y!=num)
			{
				avg=(avg+y);
			}
		}
		System.out.println("Average is "+ (avg/(arr.length-1)));
	}

}
