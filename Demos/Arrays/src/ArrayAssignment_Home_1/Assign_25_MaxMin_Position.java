package ArrayAssignment_Home_1;

public class Assign_25_MaxMin_Position {

	public static void main(String[] args)
	{
		int a[]= {-20,0,9,-25,15,16,88,37,23,91};
		int i,max=a[0],count=0;
		for( i=1; i<a.length; i++ )
		 {
			 if (a[i]>max)
			 {
				 max=a[i];count=(i+1);
			 }
		 }
		System.out.println("Maximum num is  "+max +" at position "+count);
		int min=a[0];
		for(i=1; i<a.length; i++)
		{
			if (a[i]<min)
			 {
				 min=a[i];count=(i+1);
			 }
		}
		System.out.println("Minimum num is  "+min +" at position "+count);
		
	}

}
