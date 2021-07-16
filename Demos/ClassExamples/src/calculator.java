
public class calculator
{
	int sq,cu;
	
	public void square(int a)
	{
		sq=a*a;
		System.out.println("Square of Number is =" + (sq));
	}
	
	public int cub(int a)
	{
		cu = a*a*a;
		return cu;       // return value of cu in main
	}
}
