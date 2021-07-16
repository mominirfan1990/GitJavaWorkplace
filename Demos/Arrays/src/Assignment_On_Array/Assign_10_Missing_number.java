package Assignment_On_Array;

public class Assign_10_Missing_number {

	public static void main(String[] args)
	{  
		int i, flag=0;
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for( i=0; i<arr.length; i++)
		{
			if(arr[i]!=(i+1))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		System.out.println("Missing number is "+(i+1));
		else
			System.out.println("No any missing number ");
	}

}
