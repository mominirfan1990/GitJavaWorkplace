package ArrayAssignment_For_Each_Loop;

public class A_06_Maximum_in_Coloum {

	public static void main(String[] args)
	{
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
	
		int max=0;
		int i=0,j=0;
		for(int x[]:arr)
		{
			max=arr[i][j];
			for(int y:x)
			{

				if(max<y)
				{
					max=y;
				}
				++;
			}
			System.out.println(max);
			j++;
			
		}
	}
}
