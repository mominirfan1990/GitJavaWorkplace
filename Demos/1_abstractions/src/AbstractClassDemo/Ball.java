package AbstractClassDemo;

public class Ball extends Movement
{
	@Override
	public void move(int s) 
	{
		speed=s;
		System.out.println("moving on "+direction+" at speed "+s);
	}
	public void rolling()
	{
		System.out.println("ball is rolling ");
	}
	public static void main(String[] args)
	{
		Movement mv = new Ball();
		mv.move(100);
		mv.speedin(20);
		
		Ball b= (Ball)mv;
		b.rolling();
		
	}	
}
