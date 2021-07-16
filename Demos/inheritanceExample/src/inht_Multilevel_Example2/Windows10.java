package inht_Multilevel_Example2;

public class Windows10 extends Windows7
{
	String compp;
	
	public void accept2(String cd)
	{
		compp=cd;
	}
	
	public void display2()
	{
		System.out.println(" Compatible with ::"+ compp);
		display();
	}
	
	public static  void main(String[] args)
	{
		Windows10 ww = new Windows10();
		ww.accept1("512 MB RAM ");
		ww.accept("up tp 4 GB RAM, 32 and 64 bit");
		ww.accept2("128 GB RAM , All operating Sysytem");
		ww.display2();
	}
}

