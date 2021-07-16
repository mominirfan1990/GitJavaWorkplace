package MarchPaperQ;

public class Matrix_four_four {

	public static void main(String[] args)
	{
		int arr[][]= {{12,34,2,4},{2,90,11,0},{6,19,7,9},{66,41,22,3}};
		for(int i=0; i<arr.length;i++)
		{
			if(i==0 || i==3)
			{
				for(int j=0; j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			else
			{
				for(int j=0; j<arr[i].length;j++)
				{
					if(j==0 || j==arr[i].length-1)
					{
					System.out.print(arr[i][j]+" ");
					}
					else
						System.out.print("   ");
				}
				System.out.println();
				
			}
		}

	}

}
