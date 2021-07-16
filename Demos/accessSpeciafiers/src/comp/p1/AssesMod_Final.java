package comp.p1;

public class AssesMod_Final
{	
	//final float PI=3.14f;  //declare and initialized at class level
	final int x;       
	AssesMod_Final(int a)
	{
		x=a;
	}
	
	public void show()
	{
		//System.out.println("X "+x);
	}
	public static void main(String[] args)
	{
		
		//final float PI;      // declare final and initializes next line only in main method;
		//PI = 3.14f;
		
		final AssesMod_Final obj = new  AssesMod_Final(23);
		
		 
		 
	}
	
}
