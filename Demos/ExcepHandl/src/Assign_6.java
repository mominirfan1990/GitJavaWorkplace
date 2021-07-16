class UncheckedExcep
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
			System.out.println("in ArrayIndexOutOfBoundsException block ");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("in ArithmeticException block");
			System.out.println(e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("In StringIndexOutOfBoundsException block");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("In null pointer Exception block");
			System.out.println(e.getMessage());
		}
	}
}
public class Assign_6 
{
	public static void main(String[] args)
	{
		UncheckedExcep et = new UncheckedExcep();
		char arr[]= {'a','b','c'};
		et.receive(arr);
	}

}
