
public class Pattern {

	public static void main(String[] args)
	{
		int a[]= {5,6,7};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				for(int k=0; k<a.length; k++)
				{
					System.out.print(a[i]+""+a[j]+""+a[k]+", ");
				}
				System.out.print(a[i]+""+a[j]+", ");
			}
			System.out.print(a[i]+", ");
		}
	}

}
