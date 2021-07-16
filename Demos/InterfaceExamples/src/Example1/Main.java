package Example1;

public class Main 
{
	public static void main(String[] args)
	{
		Employee e = new VP(50000);
		((VP)e).calcNetSal();
		
		e= new HR(30000);
		((HR)e).calcNetSal();
			
	}
}
