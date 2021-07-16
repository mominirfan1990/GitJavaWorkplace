import java.rmi.AccessException;

public class ExceptnHa1 {

	public static void main(String[] args) 
	{
		try
		{
			int sum=0,avg=0;
			for(int i=0; i<args.length; i++)
			{
				int val = Integer.parseInt(args[i]);
				System.out.println(val);
				sum =sum+val;
			}
			System.out.println(avg=sum/(args.length));
					
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException | NumberFormatException b)
		{
			System.out.println(b.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
