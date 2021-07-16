/*
public class Test1
{
 static int i=1;
 
 public static void main(String[] args)
 {
	 for(int i=1;i<10;i++)
	 	 i=i+2;
	 System.out.println(i+ " ");
	 
 }
}
*/
/*
class X
{
	int m;
	{
		m=1111;
		m=m++;
		System.out.println(m);
	}
}
class Y extends X
{
	{
		System.out.println(methodOfY());
	}
	int methodOfY()
	{
		System.out.println("inside method of y");
		return m-- + --m;
	}
}

public class Test1
{
public static void main(String[] args)
{
	Y y = new Y();
}
}

*/

/*
class Test1
{
	static int x = 10;
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		Test1 t2= new Test1();
		Test1.x=20;
		t2.x=21;
		System.out.println(t1.x+" ");
		System.out.println(t2.x);
		
	}
}
*/
/*
class SuperClassOne
{
	int i;
	static void methodOne()
	{
		System.out.println("From super class");
	}
}
class SubClassOne extends SuperClassOne
{
	static 
	{
		System.out.println(super.1);
		this.methodTwo();
	}
}
*/
/*
final  class PersonalLoan
{
	public String getName()
	{
		return "Personal Loan";
	}
}
class CheapPersonalLoan extends PersonalLoan
{
	public final String getName()
	{
		return " cheap Personal Loan";
	}
}
*/
/*
class A1
{
	static final int i=10;
}
class B extends A1
{
	int i=20;
	public B()
	{
		super.i=90;  i=90;
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		A1 a = new B();
		System.out.println(a.i);
	}
}
*/