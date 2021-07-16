package Example6;

public class Intern implements SalCal
{

	@Override
	public float CalSal(float bs) 
	{
		
		return 0;
	}
	public void CalStipend()
	{
		SalCal.super.CalStipend();
		System.out.println("Inter redifined method");
	}
	public void display()
	{
		System.out.println("display" );
	}


}
