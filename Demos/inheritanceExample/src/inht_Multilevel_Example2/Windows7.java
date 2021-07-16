package inht_Multilevel_Example2;

public class Windows7 extends WindowsXp
{
	String comp;
	
	public void accept(String c)
	{
		comp=c;
	}
	
	public void display()
	{
		System.out.println("Compatible with ::"+ comp);
		display1();
	}
}
