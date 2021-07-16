package market;

public class Fruit
{
	int qty; float price;
	String taste, color;
	
	public void purchaseFruit(int q, float p, String taste, String color)
	{
		qty = q;
		price = p;
		this.taste = taste;
		this.color = color;
		System.out.println("Please pay Rs  "+ (qty*price));
	}
	protected  void display()
	{
		System.out.println("Fruit is "+color+"  in color and "+ taste);
	}
}
