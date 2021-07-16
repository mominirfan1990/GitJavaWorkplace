package ArrayAssignment_1;

import java.util.Scanner;

public class find_min_using_sort 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter length of Array");
		int a[]= new int [sc.nextInt()];
		
		for(int z=0; z<a.length;z++)
		{
			System.out.println("Please enter " +(z+1)+" number ");
			a[z]= sc.nextInt(); 
		}
	   for (int i=1; i<a.length;i++)
	   {
		  int temp =a[i];
		  int j=i-1;
		  while (j>=0 && a[j]>temp)
		  {
			  a[j+1]=a[j];
			  j--;
		  }
		  a[j+1]=temp;
	  }
	 for(int x:a)
	 {
		 System.out.print(x+" ");
	 }
	 System.out.println("\n Please eneter which lowest number you want to display");
	 int num= sc.nextInt();
	 System.out.println(num+ " Lowest number is ::"+ a[num-1]);
}
}
