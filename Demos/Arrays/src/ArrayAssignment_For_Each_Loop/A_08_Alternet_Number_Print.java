package ArrayAssignment_For_Each_Loop;

public class A_08_Alternet_Number_Print {

	public static void main(String[] args) 
	{
	int arr[]= {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
	int i=0;
	for(int x:arr)
	{
		if(i%2==0)
		{
		System.out.print(x+" ");	
		}
		i++;
	}
	}

}
