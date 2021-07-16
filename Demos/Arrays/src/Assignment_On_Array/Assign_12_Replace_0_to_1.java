package Assignment_On_Array;

public class Assign_12_Replace_0_to_1 {

	public static void main(String[] args)
	{
		int ar[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==0)
			{
				ar[i]=1;
			}
		}
		for(int x:ar)
		{
			System.out.print(x+" ");
		}
	}

}
