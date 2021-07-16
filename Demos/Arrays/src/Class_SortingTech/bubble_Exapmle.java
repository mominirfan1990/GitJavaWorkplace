package Class_SortingTech;

 class bubble_Exapmle {

	public void B_Sort(int a[])
	{
		int flag=0;
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])  // assending order (for desending order if(a[j]<a[j+1]) )
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				 break;

		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}
	public static void main(String[] args) 
	{
		int a[]= {2,5,6,3,1};
		bubble_Exapmle be = new bubble_Exapmle();
		be.B_Sort(a);
		
	}

}
