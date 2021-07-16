// find 2nd max of number
package ArrayAssignment_1;

public class Assign_8 {

	public static void main(String[] args)
	{
	 int a[]= {20,0,31,45,100,1,105,90,103};
/*	int i,max=a[0];
	 for( i=1; i<a.length; i++ )
	 {
		 if (a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	System.out.println("1st max ::"+max);
	int x=max;
	 max=a[0];
	for( i=1; i<a.length; i++ )
	 {	
		if(a[i]!=x)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
	 }
	System.out.println("2nd max is :"+max);
*/	
	 int i,max1=a[0],max2=a[0];
	 for( i=1; i<a.length; i++ )
	 {
		 if (a[i]>=max1)
		 {
			 max2=max1;
			 max1=a[i];
		 }
	 }
	System.out.println("2nd max ::"+max2);
	
	}
}
