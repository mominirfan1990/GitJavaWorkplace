package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assing_14_Insert_AtPosition {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter Lenght of array");
		int a[]=new int[sc.nextInt()];
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n Eneter which position you want to eneter Number");
		int i= sc.nextInt();
		System.out.println("\n Eneter which number you want to enter");
		a[i-1]=sc.nextInt();
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
