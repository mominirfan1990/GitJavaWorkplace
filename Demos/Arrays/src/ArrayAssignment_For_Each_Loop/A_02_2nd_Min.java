package ArrayAssignment_For_Each_Loop;

public class A_02_2nd_Min {

	public static void main(String[] args) 
	{
		 int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		 
		 int min=arr[0];
		 for(int x:arr)
		 {
			 if(min > x)
			 {
				 min=x;
			 }
		 }
		 int min2=arr[0];
		 for(int x:arr)
		 {
			 if(min2 > x && x > min)
			 {
				 min=x;
			 }
		 }
		 System.out.println("Second Minimum is "+min2);
	}

}
