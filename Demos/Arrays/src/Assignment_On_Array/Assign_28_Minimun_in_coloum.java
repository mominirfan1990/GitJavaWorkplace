package Assignment_On_Array;

public class Assign_28_Minimun_in_coloum {

	public static void main(String[] args)
	{
		int arr[][]= {{22,31, 9}, {12, 5, 16}, {34, 42, 2}};
		int min=0;
		for(int i=0; i<arr.length; i++)
		{ 
			min=arr[0][i];
			for(int j=1; j<arr.length; j++)
			{
				if(min>arr[j][i])
				{
					min =arr[j][i];
				}
			}
			System.out.println(" Minimum in Coloum  "+min);
		}

	}

}
