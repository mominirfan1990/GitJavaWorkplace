package ArrayAssignment_For_Each_Loop;

public class A_03_Comman_Between_TwoArray {

	public static void main(String[] args) 
	{
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		
	 for(int x:arr1)
	 {
		 for(int y:arr2)
		 {
			 if(x==y)
			 {
				 System.out.println(x+" ");
			 }
		 }
	 }
	}

}
