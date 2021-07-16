package ArrayExtra;

import java.util.Scanner;

public class Q_05_Reverse_Array {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Lenght of array");
		int l=sc.nextInt();
		int arr[]= new int[l];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Eneter element in array");
			arr[i]=sc.nextInt();
		}
		System.out.println("Given array ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println("Reverse array ");
		if(arr.length%2==0)       // for evenarray lenght
		{
			for(int i=0;i<(l/2);i++)
			{
				int temp=arr[i];
				arr[i]=arr[(l/2+i)];
				arr[(l/2+i)]=temp;
			}
		}
		else if(l%2!=0)     // for odd array lenght
		{
			for(int i=0;i<(l/2);i++)
			{
				int temp=arr[i];
				arr[i]=arr[(l/2+i+1)];
				arr[(l/2+i+1)]=temp;
			}

		}
		for(int q:arr)
		{
			System.out.print(q+" ");
		}
	}

}
