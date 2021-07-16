package ArrayExtra;

import java.util.Arrays;

public class Q_03 
{
	public static void main(String[] args)
	{
		int[] arr = {12, 34, 32,25,54,68 } ;
		int[] newArr = new int[arr.length];
		for( int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i]%4 == 0)
			{
				newArr[i] = arr[i]/4;
			}
		}
		System.out.println(Arrays.toString(newArr));	
	}
}


