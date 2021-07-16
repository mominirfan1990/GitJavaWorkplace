package ArrayAssignment_For_Each_Loop;

public class A_07_Square_Number {

	public static void main(String[] args)
	{
		int arr[]={23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		for(int x:arr)
		{
			int z=(int) Math.sqrt(x);
			if(x>0 && x==(z*z))
				System.out.println(x);
		}
		
		
		
		
	}

}
