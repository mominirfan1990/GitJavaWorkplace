package Example2;

public class School implements Calculate
{
	int prev=60;
	public void CalculateAddition( int b)
	{
		System.out.println("Total Marks is :"+ (prev+b));
	}
	
	public void CalculateMultiplicatipn(int a, int b)
	{
		System.out.println("Multiplication is :"+ (a*b));
	}
	public void CalculateDivision(int a, int b)
	{
		System.out.println("Divison is :"+ (a/b));
	}
	public void CalculateSubstarction(int a, int b)
	{
		System.out.println("Substaction is :"+ (a-b));
	}
	
	public  void squred(int a , int b)
	{
		System.out.println(" Squred is ");
	}

}