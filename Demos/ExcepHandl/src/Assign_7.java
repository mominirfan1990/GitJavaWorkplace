class EmptyCatchOnly
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
		catch(ArrayIndexOutOfBoundsException e)
		{
	
		}
		
	}
}
	
public class Assign_7
{
	public static void main(String[] args)
	{
		EmptyCatchOnly et = new EmptyCatchOnly();
		char arr[]= {'a','b','c'};
		et.receive(arr);
	}
}
