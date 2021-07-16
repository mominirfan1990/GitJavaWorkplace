
class ThrowArrayIndex 
{
	public void receive( char []arr) throws ArrayIndexOutOfBoundsException
	{
		char ch[]=new char[arr.length];
		for(int i=0; i<=arr.length; i++) 
		{
			if(i<=arr.length)
				throw new ArrayIndexOutOfBoundsException(" Array Index is greather than lenght ");
			ch[i]=arr[i];
		}
	}
}
public class Assign_1 {

	public static void main(String[] args)
	{
		ThrowArrayIndex tri = new ThrowArrayIndex();
		char arr[]= {'a','b','c'};
		try
		{
			tri.receive(arr);
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
			System.out.println(s.getMessage());
			StackTraceElement[] aa=s.getStackTrace(); // get stack trace information
			for(StackTraceElement x:aa)
			{
				System.out.print(x+" ");
			}
		
		}
	}

}
