package Kp1;

enum Fruit {
	Apple(20), Mango(60), Banana(5), Jackfruit(50), Orange;
	private int price;
	
	Fruit()
	{
		price =0;
		System.out.println("in default");
	}
	Fruit(int p)
	{
		price = p;
		System.out.println("In parameterised");
	}
	int getPrice()
	{
		return price;
	}
}
public class EnumDemo2 {
	public static void main (String[] args)
	{
		System.out.println("in main");
		System.out.println(" Price of Mano "+Fruit.Mango.getPrice());
		
		System.out.println("Price of each fruit pe 5 piece ");
		
		for(Fruit ft : Fruit.values())
			System.out.println(ft+ " costs "+ ft.getPrice());
	}

}
