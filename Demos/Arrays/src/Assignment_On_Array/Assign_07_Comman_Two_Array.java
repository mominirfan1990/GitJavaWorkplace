package Assignment_On_Array;

import java.util.Scanner;

class commArray
{
/*	public void acceptArray(int a[], int b[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element of  1st Array");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<b.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element of  2nd Array");
			b[i]=sc.nextInt();
		}
	}
*/	public void findComman(int a[], int b[])
	{
		System.out.println("Comman Element are ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}


}
public class Assign_07_Comman_Two_Array
{
		public static void main(String[] args)
	{
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Eneter lenght of 1st Array ");
		int q= sc.nextInt();
		System.out.println("Eneter lenght of 2nd Array ");
		int w=sc.nextInt();
		int aar1[]=new int[q];
		int arr2[]=new int[w];
	*/
			int aar1[]= {12, 23, 34, 67 ,78, 91, 56};
			int arr2[]= {39, 25, 15, 23, 55, 91, 66, 22};
		commArray ca =new commArray();
		//ca.acceptArray(aar1, arr2);
		ca.findComman(aar1, arr2);
		
	}
}
