package Example4;

public class Trainle extends Shape
{
	float a=20,  b=30, c=10;
	public void discribeShape() 
	{
		System.out.println("Shape is Traingle");
	}

	public void CalcArea()
	{
		System.out.println("Area of Taringle is ::" +(0.5*(a*b)));
	}

	public void CalcPerimeter() 
	{
		System.out.println("Perimeter of Taringle is ::" + (a+b+c));
	}

}
