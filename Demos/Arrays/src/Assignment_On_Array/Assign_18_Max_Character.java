package Assignment_On_Array;


public class Assign_18_Max_Character {

	public static void main(String[] args) 
	{
		char arr[]={'A', 'D', 'E', 'x','R','Z','p'};
		char max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximun character in array is "+max);
	}

}

