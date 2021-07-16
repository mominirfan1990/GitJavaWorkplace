class StringArrayIndExcep
{
	public void receive( char []arr, String str) 
	{
		char ch[]=new char[arr.length];
		try
		{
			String s1=str.replace('x', 'z');
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
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("In StringIndexOutOfBoundsException block");
			System.out.println(e.getMessage());
		}
	}
}
public class Assign_8
{
	public static void main(String[] args)
	{
		StringArrayIndExcep et = new StringArrayIndExcep();
		char arr[]= {'a','b','c'};
		String str="Irfan";
		et.receive(arr,str);
	}

}
