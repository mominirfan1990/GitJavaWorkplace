package ArrayAssignment_For_Each_Loop;

public class A_10_3D_Array {

	public static void main(String[] args) 
	{
		int arr[][][]= {	{ {22,31,9}, {12,5,16}, {24,45,6} }, 
				{ {34,42,2}, {23,5,30}, {66,72,1} },
				{ {5,66,78}, {91,2,21}, {21,11,8} }   };
		
		for(int x[][]:arr)
		{
			for(int y[]:x)
			{
				for(int z:y)
				{
					System.out.print(z+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
