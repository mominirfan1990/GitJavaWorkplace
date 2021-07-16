
class TryFinalOnly
{
	public void receive( char []arr) 
	{
		char ch[]=new char[arr.length];
		try
		{
			for(int i=0; i<=arr.length; i++) 
			{
			 ch[i]=arr[i];
			}
		}
	/*	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In Catch block");
		}
	*/	finally
		{
			System.out.println("in Finally block");
		}
		
	}
}
	
public class Assign_5 
{
	public static void main(String[] args)
	{
		TryFinalOnly ft = new TryFinalOnly();
		char arr[]= {'a','b','c'};
		ft.receive(arr);
	}
}


