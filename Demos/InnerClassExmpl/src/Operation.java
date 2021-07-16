
interface Calculator
{
	public void addition(int a, int b);
	public void substract(int a, int b);
	
}

public class Operation implements Calculator
{
	
	@Override
	public void addition(int a, int b) {}

	@Override
	public void substract(int a, int b) {}
	public static void main(String arge [])
	{
		Operation cl= new Operation()
		{	
			@Override
			public void addition(int a, int b)
			{
				System.out.println("Addition is "+(a+b));
			}
			@Override
			public void substract(int a, int b)
			{
				System.out.println("Substraction is "+(a-b));
			}	
		};
		cl.addition(4, 5);
	}



}
