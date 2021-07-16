package OverridingExample;

public class Teenager extends Kid
{
	public void readBook()
	{
		
		name = "Teaanager Default ";
		pages = 300;
		System.out.println("name "+name+" pages "+pages);
	}
	public void readBook(int a, String s)
	{
		name = s;
		pages = a;
	}
	public static void main(String[] args)
	{
		Kid k1=null,k2=null;
		BigKid K1 = new BigKid();
		Teenager K2= new Teenager();
		
		K1.readBook();
		K2.readBook();
	}

}
