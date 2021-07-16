
class encapsulation 
{

	private String name ;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String X)
	{
		name=X;
	
	}

}

// main program

class encapsMain
{
	public static void main(String[] args)
	{
	
		encapsulation E = new encapsulation();
		System.out.println(E.getName());
		E.setName( "irfan");
		System.out.println(E.getName());
	}
}