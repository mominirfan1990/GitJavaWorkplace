package ArrayAssignment_For_Each_Loop;

public class A_05_Minimum_in_Row {

	public static void main(String[] args) 
	{
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		int min=0;
		int i=0;
		for(int x[]:arr)
		{
			min=arr[i][0];
			for(int y:x)
			{
				if(min>y)
				{
					min=y;
				}
			}
			System.out.println(min);
			i++;
			
		}
		
	}

}
