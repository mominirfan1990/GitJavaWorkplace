package OverridingExample;

public class BigKid extends Kid
{
	public void readBook()
	{
		super.readBook();
		name = "BigKid Default";
		pages = 200;
		System.out.println("name "+name+" pages "+pages);
	}
	public void readBook(int z, String c)
	{
		name = c;
		pages = z;
	}
	
	
}
