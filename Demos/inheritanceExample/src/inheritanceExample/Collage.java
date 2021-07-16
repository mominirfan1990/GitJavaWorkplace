//parent class of Student class
package inheritanceExample;

public class Collage
{
	 String dpt, name, cources;
	
	public void takeAdmiddion(String d, String n, String c)
	{
		dpt= d;
		name = n;
		cources = c;
		
	}
	
	protected void show()
	{
		System.out.println("Colage name ::"+ name + "\n  Department ::"+dpt+ "\n Cources ::"+ cources );
	}
}
