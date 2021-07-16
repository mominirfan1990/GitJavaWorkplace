package inht_hirarchical_Example3;

public class Gents extends Salon
{
	int price;
	String sr, nail; 
	
	Gents()
	{
		super ();
		price =100;
		sr= "Shaving";
		nail= "Nail Cutting";
	
	}
	Gents(int a, String b, String d)
	//public void accept(int a, String b, String d)
	{
		price = a;
		sr= b;
		nail= d;
	}
	public void show()
	{
		System.out.println("Welcome to Gents salon ");
		System.out.println("Do any Type Cutting just :"+price);
		System.out.println(sr+ " and "+ nail+"  cutting available");
	}
	

	public static void main(String[] args)
	{
		Gents gt = new Gents();
		//gt.accept("SPA", "Massag", "hair cutting ", "Coloring");
	//	gt.accept(100, "Shaving", "Nail");
		gt.show();
		gt.display();
	}
}
