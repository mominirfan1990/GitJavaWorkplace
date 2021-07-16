package gslabDemo;

public class SortbyBubble {

	public static void main(String[] args)
	{
		int arr[]= {12,45,78,9,0,1,3};
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
