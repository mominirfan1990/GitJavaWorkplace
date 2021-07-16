
public class exmple3 
{
	public static void main(String[] args)
	{
		int []a= {7,9,10,-11,12};
		System.out.println("using normal for");
		for (int i= 0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n using Enhance for loop");
		for(int x:a)
		{
			
				
			System.out.print(x+" ");
		}
		System.out.println();
	/*	for(int i = a.length-1; i>=0;i--)
		
		{
			System.out.print(a[i]+" ");
		}
	*/	
	}
}
