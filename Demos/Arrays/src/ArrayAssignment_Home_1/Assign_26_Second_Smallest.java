package ArrayAssignment_Home_1;

public class Assign_26_Second_Smallest
{
	public static void main(String[] args) 
	{
		int a[]= {-20,0,-25,15,19,37,23};
		int i,min=a[0];
		for( i=1; i<a.length; i++ )
		 {
			 if (a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		System.out.println("1st min ::"+min);
		int x=min;
		 min=a[0];
		for( i=1; i<a.length; i++ )
		 {	
			if(a[i]!=x)
			{
				if (a[i]<min)
				{
					min=a[i];
				}
			}
		}
		System.out.println("2nd min is :"+min);
	}
}
