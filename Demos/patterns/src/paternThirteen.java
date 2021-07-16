
public class paternThirteen 
{

	public static void main(String[] args)
	{
		int i,j,k,n=5,sp=n-1;
		
		for(i=1; i<=n; i++)
		{
			int f=n-sp;
			
			for(k=1; k<=sp;k++)
			{
				System.out.print(" ");
			
			}
			for(j=1; j<=i;j++,f--)
			{
				System.out.print(f);				
				
			}
			System.out.println();
			sp--;
		   
		}
	}
}
