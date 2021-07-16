package Example3;

public class Lab implements ScientficCalc
{

	
	public void addition(int x, int y) 
	{
			System.out.println("Addition is ::"+(x+y));
	}
	public void substraction(int x, int y) 
	{
		System.out.println("Substarction is ::"+(x-y));
	}
	public void division(int x, int y) 
	{
		System.out.println("division is ::"+(x/y));
	}

	public float findSqure(int x) 
	{
		return (x*x);
	}

	public void findCube(int y) 
	{
		System.out.println("Cube is ::"+(y*y*y));
	}
	

}
