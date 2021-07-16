
public class ExponantioalSeris
{
	int a1,b1,n1,out;
	public void acceptDetails(int a, int b, int n)
	{
		a1=a;
		b1=b;
		n1=n;
	}
	
	public void calculateExponantail()
	{
		for(int i=n1;i>0;i--)
		{
			for(int j=0; j<n1;j--)
			{
				out=(int)(out+(a1+((Math.pow(2, j))*b1)));
			}
		}
		
	}
	
	public void displayDetails()
	{
		System.out.println("Exponantial Series Output is  :: " + out);
	}
}
