package gslabDemo;

import java.util.Arrays;

public class SortArrayByMethod 
{
	public int[] sortmethod(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		
		//Arrays.sort(arr);
		return arr;
		
	}
	public static void main(String[] args)
	{
		int arr[]= {2,6,1,8,0,5};
		
		SortArrayByMethod sb= new SortArrayByMethod();
		sb.sortmethod(arr);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
	}

}
