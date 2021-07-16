package Assignment_On_Array;

public class Assign_25_MAximun_in_Row {

	public static void main(String[] args)
	{
		int arr[][]= {{22,31, 9}, {12, 25, 16}};
		int max=0;
		for(int i=0; i<arr.length; i++)
		{ 
			max=arr[i][0];
			for(int j=1; j<arr.length; j++)
			{
				if(max<arr[i][j])
				{
					max =arr[i][j];
				}
			}
			System.out.println(" Maximum in row  "+max);
		}
	}

}
