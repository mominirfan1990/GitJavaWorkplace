// average of array element
package ArrayAssignment_Home_1;

public class Asing_2 {

	public static void main(String[] args)
	{
		float avg=0;
		int a[]= {23,45,67,89,12};	
		for(int i=0; i<a.length;i++)
		{
			avg= (avg+a[i]);
		}
		System.out.println("Avaerage ::"+ (avg= (avg/a.length)));
	}

}
