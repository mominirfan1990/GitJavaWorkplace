package inht_hirarchical_Example1;

public class Language
{
	String type;
	
	public void acceptD(String t)
	{
		type = t;
	}
	void displayDetails()
	{
		System.out.println("Language type :"+ type);
	}
}

