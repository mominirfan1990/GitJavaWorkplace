package OverridingExample;

public class Kid 
{
	String name;
	int pages;
	public void readBook()
	{
		name = "Kid deault";
		pages = 150;
		System.out.println("name "+name+" pages "+pages);
	}
	public void readBook(int x, String y)
	{
		name = y;
		pages = x;
	}
		
}
