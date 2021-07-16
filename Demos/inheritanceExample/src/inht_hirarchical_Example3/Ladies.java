package inht_hirarchical_Example3;

public class Ladies extends Salon
{
	int price;
	String facial, nail,med; 
	
	Ladies()
	{
		
	}
	public void accept(int a, String b, String d,String e)
	{
		price = a;
		facial= b;
		nail= d;
		med=e;
	}
	public void show()
	{
		System.out.println("Welcome to Ladies salon ");
		System.out.println("Do any Type Cutting just :"+price);
		System.out.println(facial+ " and "+ nail+"  cutting " + " "+ med +" available");
	}
	

	public static void main(String[] args)
	{
		Ladies ld = new Ladies();
		//ld.accept("SPA", "Massag", "hair cutting ", "Coloring");
		ld.accept(200, "facial", "Nail","Mehandi");
		ld.show();
		ld.display();
	}

}
