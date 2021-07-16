package Example4;

public class Circle extends Shape
{
	float r=10;
	public void discribeShape() 
	{
		System.out.println("Shape is Circle");
	}
	public void CalcArea() 
	{
		System.out.println("Area of Circle is ::"+ (3.14*r*r));
	}

	public void CalcPerimeter() 
	{
		System.out.println("Perimeter of Circle is ::"+(2*3.13*r));
	}

}
