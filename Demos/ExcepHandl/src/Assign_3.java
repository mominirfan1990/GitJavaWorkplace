class MultiCatchInOne 
{
	public void receive( char []arr, int s, int k) 
	{
		char ch[]=new char[arr.length];
		try
		{
			int sum =s/k;	
			for(int i=0; i<=arr.length; i++) 
			{
				if(i<=arr.length)
				ch[i]=arr[i];
			}
			
		}
		 catch(ArrayIndexOutOfBoundsException |ArithmeticException  e)
		{
			System.out.println(e.getMessage());
			StackTraceElement[] aa=e.getStackTrace(); // get stack trace information
			for(StackTraceElement x:aa)
			{
				System.out.print(x+" ");
			}
			e.printStackTrace();
		
		}
	}
}
public class Assign_3 
{
	public static void main(String[] args)
	{
		MultiCatchInOne ct = new MultiCatchInOne();
		char arr[]= {'a','b','c'};
		int s=4,k=0;
		ct.receive(arr,s,k);
	}

}
