package ArrayAssignment_For_Each_Loop;

public class A_01_2nd_Max 
{

	public static void main(String[] args)
	{
	 int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
	 
	 int max=arr[0];
	 for(int x:arr)
	 {
		 if(max < x)
		 {
			 max=x;
		 }
	 }
	 int max2=arr[0];
	 for(int x:arr)
	 {
		 if(max2 < x && x < max)
		 {
			 max2=x;
		 }
	 }
	 System.out.println("Second Maximum is "+max2);
	}

}
