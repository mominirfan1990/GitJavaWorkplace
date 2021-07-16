package DynamicPolysmExample;

public class ToyMAin 
{
	public static void main(String[] args)
	{
		Toy ts;
		ts= new Helicoptor();
		ts.move();
		
		ts = new Car();
		ts.move();
	}
}
