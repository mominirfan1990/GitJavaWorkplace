
public class Address 
{

	String city,state,country;
	
	Address()
	{
		city= "satara";
		state = "MAharashtra";
		country = "India";
		
	}
	
	Address(String q,String w,String e)
	{
		city= q;
		state = w;
		country = e;
	}
	
	public String toString()
	{
		String str="City :;"+city+"State ::"+state+"Country ::"+country;
		return str;
	}
}
