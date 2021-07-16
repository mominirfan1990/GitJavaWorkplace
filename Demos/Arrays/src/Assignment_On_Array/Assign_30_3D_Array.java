package Assignment_On_Array;

public class Assign_30_3D_Array {

	public static void main(String[] args) 
	{
		int arr[][][]= {	{ {22,31,9}, {12,5,16}, {24,45,6} }, 
							{ {34,42,2}, {23,5,30}, {66,72,1} },
							{ {5,66,78}, {91,2,21}, {21,11,8} }   };
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				for(int k=0; k<arr.length; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
