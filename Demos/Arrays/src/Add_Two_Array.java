
class Addition_Array
{
	public void displayEven(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public int [] addition(int a[], int b[])
	{
		int addarr[] = new int[a.length];
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				addarr[i]=a[i]+b[i];
			}
		
		}
				return addarr ;
	}
}

public class Add_Two_Array 
{
	public static void main(String[] args)
	{
		int a[]= {2,3,5,7,9};
		int b[]= {3,6,8,1,6};
		if(a.length==b.length)
		{	
		Addition_Array ad = new Addition_Array();
		int c[]= ad.addition(a, b);
		System.out.println(" 1st array");
		ad.displayEven(a);
		System.out.println("\n Scond array ");
		ad.displayEven(b);
		System.out.println("\n Addition of array ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		}
		else
			System.out.println("Array lenght must be same for addition");

		
	}
}