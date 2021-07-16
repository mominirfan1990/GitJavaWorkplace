package Example2;

public class Main {

	public static void main(String[] args) 
	{
		Calculate c = new Bank();
		c.CalculateAddition(20000);
		
		c= new School();
		c.CalculateAddition(40);
		
		Calculate.cube(2, 3);
		c.squred(2, 3);

	}

}
