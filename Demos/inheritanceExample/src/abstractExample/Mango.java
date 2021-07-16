package abstractExample;

 public class Mango extends PulpiFruit
{
	public String getTaste(String t)
	{
		taste = t;
		return taste;
	}
	Mango()
	{
		System.out.println("MAngo defualt Constructor");
	}
	 public void makePulp()
	{
		System.out.println("Make pulp of mango");
	}
}
