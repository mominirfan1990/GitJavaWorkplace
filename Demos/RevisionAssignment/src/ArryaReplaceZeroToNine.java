
public class ArryaReplaceZeroToNine {
	
	public static void main(String [] args)
	{
		int arr[]= {72, 69, 76, 76, 79};
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==1)
			{
				arr[i]=0;
			}
		
		}
		for(int j=0; j<=arr.length-1; j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
