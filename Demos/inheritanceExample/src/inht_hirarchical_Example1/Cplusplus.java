//child class of langauge class

package inht_hirarchical_Example1;

public class Cplusplus extends Language
{

	String  level,type;
	
	public void accept( String tp,String lev)
	{
		type = tp;
		level = lev;
		
	}
	public void show()
	{
		System.out.println("C++ langauge is   "+level +"\n Set of instruction ::"+type);
	}
	
	public static void main(String[] args)
	{
		Cplusplus cp = new Cplusplus();
		cp.accept("Unlimited ","Mid level" );
		cp.acceptD("Software ");
		cp.show();
		cp.displayDetails();
	}
	
}
