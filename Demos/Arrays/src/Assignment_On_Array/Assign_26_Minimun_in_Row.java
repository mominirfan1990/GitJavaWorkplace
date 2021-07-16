package Assignment_On_Array;

public class Assign_26_Minimun_in_Row {

	public static void main(String[] args) 
	{
		int arr[][]= {{22,31, 9}, {12, 25, 16}};
		int min=0;
		for(int i=0; i<arr.length; i++)
		{
			min=arr[i][0];
			for(int j=1; j<arr.length+1; j++)
			{
				if(min>arr[i][j])
				{
					min =arr[i][j];
				}
			}
			System.out.println(" Minimum in row  "+min);
		}
	}

	

}
