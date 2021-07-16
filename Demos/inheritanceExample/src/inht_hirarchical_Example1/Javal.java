//child class of langauge class

package inht_hirarchical_Example1;

public class Javal extends Language
{
	String  level,type;
	
	public void accept( String tp,String lev)
	{
		type = tp;
		level = lev;
		
	}
	public void show()
	{
		System.out.println("JAVA langauge is   "+level +"\n Set of instruction ::"+type);
	}
	
	public static void main(String[] args)
	{
		Javal jl = new Javal();
		jl.accept("Unlimited ","Top level" );
		jl.acceptD("Software ");
		jl.show();
		jl.displayDetails();
	}
}
