package Assignment_On_Array;

class Equality
{
	boolean flag= false;
	public void checkEquality(int a[], int b[])
	{
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<b.length; j++)
				{
					if(a[i]==b[j])
					{
						flag=true;
					}
				}
			}
			if(flag==true)
				System.out.println("Arrays are equal");
		}
		else
			System.out.println("Given arrays are not equal ");
	}
}


public class Assign_09_Equality_Two_Array
{

	public static void main(String[] args)
	{
		int arr1[]= {12,22,34,42,52,62};
		int arr2[]= {52,22,62,12,42,62};
		
		Equality eq = new  Equality();
		eq.checkEquality(arr1, arr2);
	}

}
