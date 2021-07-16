package Assignment_On_Array;

public class Assign_21_Square_in_Array {

	public static void main(String[] args)
	{
		int arr[]={23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				int x=(int)Math.sqrt(arr[i]);
				if(arr[i]==(x*x))
					System.out.println(arr[i]);
			}
		}
	}

}
