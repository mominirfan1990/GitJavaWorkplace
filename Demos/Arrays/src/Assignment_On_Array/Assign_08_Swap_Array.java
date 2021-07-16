package Assignment_On_Array;

public class Assign_08_Swap_Array 
{

	public static void main(String[] args)
	{
		int arr[]= {2,4,9,0};
		for(int i=0; i<arr.length/2; i++)
		{
			int temp= arr[i];
			arr[i]=arr[arr.length/2+i];
			arr[arr.length/2+i]=temp;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
