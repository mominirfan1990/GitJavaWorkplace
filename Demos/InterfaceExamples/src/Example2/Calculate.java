package Example2;

public interface Calculate 
{
	int pre = 10000;
	void CalculateAddition( int b);
	void CalculateMultiplicatipn(int a, int b);
	void CalculateDivision(int a, int b);
	void CalculateSubstarction(int a, int b);
	default void squred(int a , int b)
	{
		System.out.println("Squred of A is "+(a*a)+"and B is "+(b*b));
	}
	static void cube(int a, int b)
	{
		System.out.println("Cube of A  is :"+(a*a*a)+ " and B is "+(b*b*b));
	}
}
