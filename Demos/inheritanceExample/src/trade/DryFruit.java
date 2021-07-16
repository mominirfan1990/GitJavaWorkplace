package trade;
import market.Fruit;

public class DryFruit extends Fruit
{
	String size; char grade;
	float wSaleRate;
	
	public void saleDryFruit(String s, char g, float wsr)
	{
		size= s;
		grade=g;
		wSaleRate= wsr;
	}
	
	public void show()
	{
		System.out.println("Whole sate rate for fuit is  "+ wSaleRate + "for "+size+"size");
		
	}
	
	
	public static void main(String[] args)
	{
		DryFruit almond = new DryFruit();
		almond.purchaseFruit(6, 900, "Tasteless", "almond");  // methods from parent class
		almond.display();										// method calls from parent class
		almond.saleDryFruit("m", 'b', 800);   //method from child class
		almond.show();
		almond.display();
	}
	

}


