package Assignment_On_Array;

public class Assign_17_Min_Character {

	public static void main(String[] args) 
	{
		char arr[]={'A', 'D', 'E', 'x', 'z', 'R'};
		char min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimun character in array is "+min);
	}

}
