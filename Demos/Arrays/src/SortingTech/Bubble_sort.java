package SortingTech;

public class Bubble_sort {

	public static void main(String[] args)
	{
		int a[]= {15,16,6,8,5};
		 
		for(int i=0; i<(a.length-1); i++)
		{
			boolean flag =false;
			for(int j=0; j<(a.length-1-i);j++)
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag = true;
				}
			}
			//if(flag == true)
			//break;
		}
		for(int z :a)
		{
			System.out.print(z+" ");
		}
		
	}

}
