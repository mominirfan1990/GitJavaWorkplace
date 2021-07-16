package ArrayExtra;

public class Q_04
{
	public static void main(String[] args) 
	{
		A b1 = new B();	
		System.out.println(b1.i++);
		B b2 = new B();
		System.out.println(b2.i);	
	}
}
class A 
{
		static int i = 6 ;
		static
		{
			System.out.println("border");
		}
		{
			System.out.println("uri");
		}
}
class B extends A 
{
		static int i = 10 ;
		static 
		{
			System.out.println("kesari");
		}
		{
			System.out.println("tanaji");
		}
}
	

