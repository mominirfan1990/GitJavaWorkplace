
public class StaticBlocksExmpl
{

	int a,b,c;
	static int x,y,z;
	
	static
	{
		System.out.println("We are in static block 1");
		y=10; z=8;
		x=y+z;
	}
	
	{
		System.out.println("this is instatnce block 1" );
		a=12;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("we are in main");
		System.out.println("x " + x+ " y "+y+" z "+z);
		
		StaticBlocksExmpl o1 = new StaticBlocksExmpl();
		System.out.println("a="+ o1.a);
		StaticBlocksExmpl o2 =new StaticBlocksExmpl();
		System.out.println("a="+ o2.a);
	}
	
	static
	{
		System.out.println("We are in static block 2");	
	}
	
	static
	{
		System.out.println("We are in static block 3");
		y=100; z=800;
		x=y+z;
	}
}
