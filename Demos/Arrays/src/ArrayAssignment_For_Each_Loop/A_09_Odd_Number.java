package ArrayAssignment_For_Each_Loop;

public class A_09_Odd_Number
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,5,6,7,8,9,11,13,14,15,16,18,19};
		for(int x:arr)
		{
			if(x%2!=0)
			System.out.println(x);
		}
	}

}
