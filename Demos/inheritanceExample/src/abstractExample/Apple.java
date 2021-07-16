package abstractExample;

public class Apple extends Fruit
{
	public String getTaste(String t)
	{
		taste = t;
		return taste;
	}
	public void makeJuice()
	{
		System.out.println("Make juice of Apple");
	}

}
