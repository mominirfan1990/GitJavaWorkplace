package SortingTech;

public class Selection_Sort 
{
	public static void main(String [] args)
	{
		int a[]= {7,4,10,8,3,1};
		for (int i= 0; i<(a.length-1); i++)
		{
			int min=i;
			for(int j=i+1; j<a.length; j++ )
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			if(min != i)
			{
				int c = a[i];
				a[i]=a[min];
				a[min]=c;
			}
		}
		for(int z : a)
		{
			System.out.print(z+" ");
		}
	}

	
}
