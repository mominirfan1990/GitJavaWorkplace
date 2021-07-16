package Assignment_On_Array;

public class Assign_29_Shuffle_Array {

	public static void main(String[] args) 
	{
		int arr[]= {5, 6, 23, 67, 39, 10, 2};
		int temp =arr[0];
		for(int i=1; i<arr.length; i++) 
		{
			arr[i-1]=arr[i];           // shuffle means left shift roted array
		}
		arr[arr.length-1]=temp;
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
