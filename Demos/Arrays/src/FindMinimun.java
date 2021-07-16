//finding minimun value among give array
public class FindMinimun {

	public static void main(String[] args)
	{
		int a[]= {7,9,2,-3,4};
		int min=a[0];
		int i,j;
				
		for( i=1;i<a.length;i++)
		{
			if(a[i]<min)  // for find minimum number
			{
				min=a[i];
			}
		}
	
		System.out.println("Minimun value is "+ min);
				
	}

}
