
public class PassArrEven
{
	public void displayEven(int a[])
	{
		System.out.println("Even Numbers are");
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.print( a[i]+"  ");
				
			}
			
		}
		
	}

	public static void main(String[] args)
	{
		int even[]= {2,3,4,5,6,7,8,9};
		PassArrEven ev = new PassArrEven();
		ev.displayEven(even);
	}
}
