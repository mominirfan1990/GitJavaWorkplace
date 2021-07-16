package Assignment_On_Array;

public class Assign_27_MAximun_in_Coloum {

	public static void main(String[] args) 
	{
		int arr[][]= {{22,31, 9}, {12, 25, 16}, {34, 42, 2}};
		int max=0;
		for(int i=0; i<arr.length; i++)
		{ 
			max=arr[0][i];
			for(int j=1; j<arr.length; j++)
			{
				if(max<arr[j][i])
				{
					max =arr[j][i];
				}
			}
			System.out.println(" Maximum in Coloum  "+max);
		}

	}

}
