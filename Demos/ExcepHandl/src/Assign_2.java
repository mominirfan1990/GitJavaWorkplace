class CatchHandler 
{
	public void receive( char []arr) 
	{
		char ch[]=new char[arr.length];
		try
		{
			for(int i=0; i<=arr.length; i++) 
			{
				if(i<=arr.length)
				ch[i]=arr[i];
			}
		}
		 catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			StackTraceElement[] aa=e.getStackTrace(); // get stack trace information
			for(StackTraceElement x:aa)
			{
				System.out.print(x+" ");
			}
		
		}
	}
}

public class Assign_2 {

	public static void main(String[] args)
	{
		CatchHandler ct = new CatchHandler();
		char arr[]= {'a','b','c'};
		ct.receive(arr);
	}

}
