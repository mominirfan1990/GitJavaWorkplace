package Example4;

public class ShapeApp
{
	public static void main(String[] args)
	{
		Shape sp;
		sp = new Circle();
		sp.discribeShape();
		sp.CalcArea();
		sp.CalcPerimeter();
		
		Area ar = new Trainle();
		Trainle tr = (Trainle)ar;
		tr.discribeShape();
		tr.CalcArea();
		tr.CalcPerimeter();

	}
}
