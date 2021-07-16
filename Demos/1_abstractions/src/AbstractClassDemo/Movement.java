package AbstractClassDemo;

abstract public class Movement 
{
	int speed;
	static String direction= "forward";
	abstract public void move(int s);
	public void speedin(int s)
	{
		speed=s;
		System.out.println("moving on "+direction+" at speed "+speed );
	}
	
}
