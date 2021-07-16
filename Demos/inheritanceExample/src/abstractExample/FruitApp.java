package abstractExample;

public class FruitApp 
{
	public static void main(String[] args)
	{
		PulpiFruit t;
		t=new Mango();
		//t.purchaseFruit(100, 20, "Sweet", "Yellow");
		t.display();
	
	//	System.out.println("Taste ::"+ (t.getTaste("Sweet")));
		Mango m = (Mango)t;
		m.makePulp();
		
	}
}
